package pl.zespolowka.logit.domain.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ustawienia_keylogger", schema = "public", catalog = "pdw3")
public class KeyloggerSettings {
    private int id;
    private int keyloggerUserId;
    private short areMessagesMonitored;
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
    @Column(name = "czy_zbierac_wiadomosc", nullable = false)
    public short getAreMessagesMonitored() {
        return areMessagesMonitored;
    }

    public void setAreMessagesMonitored(short areMessagesMonitored) {
        this.areMessagesMonitored = areMessagesMonitored;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyloggerSettings that = (KeyloggerSettings) o;
        return id == that.id &&
                keyloggerUserId == that.keyloggerUserId &&
                areMessagesMonitored == that.areMessagesMonitored;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, keyloggerUserId, areMessagesMonitored);
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
