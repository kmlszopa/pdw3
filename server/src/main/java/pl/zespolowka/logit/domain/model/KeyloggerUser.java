package pl.zespolowka.logit.domain.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "uzytkownicy_keylogger", schema = "public", catalog = "pdw3")
public class KeyloggerUser {
    private int id;
    private String computerName;
    private String username;
    private String description;
    private Collection<NetworkCardInfo> networdCardInfos;
    private Collection<KeyloggerMessage> keyloggerMessages;
    private Collection<CurrentTransfer> currentTransfers;
    private Collection<InternetSettings> internetSettings;
    private Collection<KeyloggerSettings> keyloggerSettings;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nazwa_komputera", nullable = false, length = 50)
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String nazwaKomputera) {
        this.computerName = nazwaKomputera;
    }

    @Basic
    @Column(name = "nazwa_uzytkownika_na_komputerze", nullable = false, length = 50)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "opis", nullable = true, length = 250)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyloggerUser that = (KeyloggerUser) o;
        return id == that.id &&
                Objects.equals(computerName, that.computerName) &&
                Objects.equals(username, that.username) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, computerName, username, description);
    }

    @OneToMany(mappedBy = "keyloggerUser")
    public Collection<NetworkCardInfo> getNetwordCardInfos() {
        return networdCardInfos;
    }

    public void setNetwordCardInfos(Collection<NetworkCardInfo> networkCardInfos) {
        this.networdCardInfos = networkCardInfos;
    }

    @OneToMany(mappedBy = "keyloggerUser")
    public Collection<KeyloggerMessage> getKeyloggerMessages() {
        return keyloggerMessages;
    }

    public void setKeyloggerMessages(Collection<KeyloggerMessage> keyloggerMessages) {
        this.keyloggerMessages = keyloggerMessages;
    }

    @OneToMany(mappedBy = "keyloggerUser")
    public Collection<CurrentTransfer> getCurrentTransfers() {
        return currentTransfers;
    }

    public void setCurrentTransfers(Collection<CurrentTransfer> currentTransfers) {
        this.currentTransfers = currentTransfers;
    }

    @OneToMany(mappedBy = "keyloggerUser")
    public Collection<InternetSettings> getInternetSettings() {
        return internetSettings;
    }

    public void setInternetSettings(Collection<InternetSettings> ustawieniaInternetowesById) {
        this.internetSettings = ustawieniaInternetowesById;
    }

    @OneToMany(mappedBy = "keyloggerUser")
    public Collection<KeyloggerSettings> getKeyloggerSettings() {
        return keyloggerSettings;
    }

    public void setKeyloggerSettings(Collection<KeyloggerSettings> keyloggerSettings) {
        this.keyloggerSettings = keyloggerSettings;
    }
}
