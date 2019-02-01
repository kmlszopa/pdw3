package pl.zespolowka.logit.domain.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "transfer_obecny", schema = "public", catalog = "pdw3")
public class CurrentTransfer {
    private int id;
    private int keyloggerUserId;
    private Integer uploadSpeed;
    private Integer downloadSpeed;
    private Timestamp whenStarted;
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
    @Column(name = "predkosc_wysylania", nullable = true)
    public Integer getUploadSpeed() {
        return uploadSpeed;
    }

    public void setUploadSpeed(Integer uploadSpeed) {
        this.uploadSpeed = uploadSpeed;
    }

    @Basic
    @Column(name = "predkosc_pobiernia", nullable = true)
    public Integer getDownloadSpeed() {
        return downloadSpeed;
    }

    public void setDownloadSpeed(Integer downloadSpeed) {
        this.downloadSpeed = downloadSpeed;
    }

    @Basic
    @Column(name = "kiedy_rozpoczeto_pomiar", nullable = false)
    public Timestamp getWhenStarted() {
        return whenStarted;
    }

    public void setWhenStarted(Timestamp whenStarted) {
        this.whenStarted = whenStarted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrentTransfer that = (CurrentTransfer) o;
        return id == that.id &&
                keyloggerUserId == that.keyloggerUserId &&
                Objects.equals(uploadSpeed, that.uploadSpeed) &&
                Objects.equals(downloadSpeed, that.downloadSpeed) &&
                Objects.equals(whenStarted, that.whenStarted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, keyloggerUserId, uploadSpeed, downloadSpeed, whenStarted);
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
