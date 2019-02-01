package pl.zespolowka.logit.domain.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "keylogger_wiadomosci", schema = "public", catalog = "pdw3")
public class KeyloggerMessage {
    private int id;
    private int keyloggerUserId;
    private String message;
    private Timestamp messageTimestamp;
    private KeyloggerUser keyloggerUser;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_uzytkownicy_keylogger", nullable = false, insertable = false, updatable = false)
    public int getKeyloggerUserId() {
        return keyloggerUserId;
    }

    public void setKeyloggerUserId(int keyloggerUserId) {
        this.keyloggerUserId = keyloggerUserId;
    }

    @Basic
    @Column(name = "wiadomosc", nullable = false, length = 2000)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "kiedy_zebrano_wiadomosc", nullable = false)
    public Timestamp getMessageTimestamp() {
        return messageTimestamp;
    }

    public void setMessageTimestamp(Timestamp messageTimestamp) {
        this.messageTimestamp = messageTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyloggerMessage that = (KeyloggerMessage) o;
        return id == that.id &&
                keyloggerUserId == that.keyloggerUserId &&
                Objects.equals(message, that.message) &&
                Objects.equals(messageTimestamp, that.messageTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, keyloggerUserId, message, messageTimestamp);
    }

    @ManyToOne
    @JoinColumn(name = "id_uzytkownicy_keylogger", referencedColumnName = "id", nullable = false)
    public KeyloggerUser getKeyloggerUser() {
        return keyloggerUser;
    }

    public void setKeyloggerUser(KeyloggerUser keyloggerUser) {
        this.keyloggerUser = keyloggerUser;
    }
}
