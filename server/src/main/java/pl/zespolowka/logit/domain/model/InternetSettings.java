package pl.zespolowka.logit.domain.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ustawienia_internetowe", schema = "public", catalog = "pdw3")
public class InternetSettings {
    private int id;
    private int keyloggerUserId;
    private short isCurrentTransferMonitored;
    private Integer currentTransferMonitorFrequency;
    private short isUploadSpeedMonitored;
    private short isDownloadSpeedMonitored;
    private short isNetworkCardInfoMonitor;
    private Integer networkCardMonitorFrequency;
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
    @Column(name = "czy_monitorowac_transfer_obecny", nullable = false)
    public short getIsCurrentTransferMonitored() {
        return isCurrentTransferMonitored;
    }

    public void setIsCurrentTransferMonitored(short isCurrentTransferMonitored) {
        this.isCurrentTransferMonitored = isCurrentTransferMonitored;
    }

    @Basic
    @Column(name = "co_ile_monitorowac_transfer_obecny", nullable = true)
    public Integer getCurrentTransferMonitorFrequency() {
        return currentTransferMonitorFrequency;
    }

    public void setCurrentTransferMonitorFrequency(Integer currentTransferMonitorFrequency) {
        this.currentTransferMonitorFrequency = currentTransferMonitorFrequency;
    }

    @Basic
    @Column(name = "czy_predkosc_wysylania", nullable = false)
    public short getIsUploadSpeedMonitored() {
        return isUploadSpeedMonitored;
    }

    public void setIsUploadSpeedMonitored(short isUploadSpeedMonitored) {
        this.isUploadSpeedMonitored = isUploadSpeedMonitored;
    }

    @Basic
    @Column(name = "czy_predkosc_pobierania", nullable = false)
    public short getIsDownloadSpeedMonitored() {
        return isDownloadSpeedMonitored;
    }

    public void setIsDownloadSpeedMonitored(short isDownloadSpeedMonitored) {
        this.isDownloadSpeedMonitored = isDownloadSpeedMonitored;
    }


    @Basic
    @Column(name = "czy_zbierac_informacje_o_karcie_sieciowej", nullable = false)
    public short getIsNetworkCardInfoMonitor() {
        return isNetworkCardInfoMonitor;
    }

    public void setIsNetworkCardInfoMonitor(short isNetworkCardInfoMonitor) {
        this.isNetworkCardInfoMonitor = isNetworkCardInfoMonitor;
    }

    @Basic
    @Column(name = "co_ile_zbierac_informacje_o_karcie_sieciowej", nullable = true)
    public Integer getNetworkCardMonitorFrequency() {
        return networkCardMonitorFrequency;
    }

    public void setNetworkCardMonitorFrequency(Integer networkCardMonitorFrequency) {
        this.networkCardMonitorFrequency = networkCardMonitorFrequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InternetSettings that = (InternetSettings) o;
        return id == that.id &&
                keyloggerUserId == that.keyloggerUserId &&
                isCurrentTransferMonitored == that.isCurrentTransferMonitored &&
                isUploadSpeedMonitored == that.isUploadSpeedMonitored &&
                isDownloadSpeedMonitored == that.isDownloadSpeedMonitored &&
                isNetworkCardInfoMonitor == that.isNetworkCardInfoMonitor &&
                Objects.equals(currentTransferMonitorFrequency, that.currentTransferMonitorFrequency) &&
                Objects.equals(networkCardMonitorFrequency, that.networkCardMonitorFrequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, keyloggerUserId, isCurrentTransferMonitored, currentTransferMonitorFrequency, isUploadSpeedMonitored, isDownloadSpeedMonitored, isNetworkCardInfoMonitor, networkCardMonitorFrequency);
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
