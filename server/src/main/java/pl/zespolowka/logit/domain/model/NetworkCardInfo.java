package pl.zespolowka.logit.domain.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "informacje_o_karcie_sieciowej", schema = "public", catalog = "pdw3")
public class NetworkCardInfo {
    private int id;
    private int keyloggerUsersID;
    private String ineterface;
    private String mac;
    private String ip;
    private String mask;
    private String broadcast;
    private Timestamp whenInfoCollected;
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
    public int getKeyloggerUsersID() {
        return keyloggerUsersID;
    }

    public void setKeyloggerUsersID(int idUzytkownicyKeylogger) {
        this.keyloggerUsersID = idUzytkownicyKeylogger;
    }

    @Basic
    @Column(name = "ineterface", nullable = true, length = 50)
    public String getIneterface() {
        return ineterface;
    }

    public void setIneterface(String ineterface) {
        this.ineterface = ineterface;
    }

    @Basic
    @Column(name = "mac", nullable = true, length = 20)
    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Basic
    @Column(name = "ip", nullable = true, length = 20)
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Basic
    @Column(name = "maska", nullable = true, length = 20)
    public String getMask() {
        return mask;
    }

    public void setMask(String maska) {
        this.mask = maska;
    }

    @Basic
    @Column(name = "broadcast", nullable = true, length = 20)
    public String getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(String broadcast) {
        this.broadcast = broadcast;
    }

    @Basic
    @Column(name = "kiedy_zebrano_informacje", nullable = false)
    public Timestamp getWhenInfoCollected() {
        return whenInfoCollected;
    }

    public void setWhenInfoCollected(Timestamp whenInfoCollected) {
        this.whenInfoCollected = whenInfoCollected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NetworkCardInfo that = (NetworkCardInfo) o;
        return id == that.id &&
                keyloggerUsersID == that.keyloggerUsersID &&
                Objects.equals(ineterface, that.ineterface) &&
                Objects.equals(mac, that.mac) &&
                Objects.equals(ip, that.ip) &&
                Objects.equals(mask, that.mask) &&
                Objects.equals(broadcast, that.broadcast) &&
                Objects.equals(whenInfoCollected, that.whenInfoCollected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, keyloggerUsersID, ineterface, mac, ip, mask, broadcast, whenInfoCollected);
    }

    @ManyToOne
    @JoinColumn(name = "id_uzytkownicy_keylogger", referencedColumnName = "id", nullable = false)
    public KeyloggerUser getKeyloggerUser() {
        return keyloggerUser;
    }

    public void setKeyloggerUser(KeyloggerUser uzytkownicyKeyloggerByIdUzytkownicyKeylogger) {
        this.keyloggerUser = uzytkownicyKeyloggerByIdUzytkownicyKeylogger;
    }
}
