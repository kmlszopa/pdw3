package pl.zespolowka.logit.domain.dto;

public class InternetSettingsDTO {
    private int id;
    private int keyloggerUserId;
    private short isCurrentTransferMonitored;
    private Integer currentTransferMonitorFrequency;
    private short isUploadSpeedMonitored;
    private short isDownloadSpeedMonitored;
    private short isNetworkCardInfoMonitor;
    private Integer networkCardMonitorFrequency;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKeyloggerUserId() {
        return keyloggerUserId;
    }

    public void setKeyloggerUserId(int keyloggerUserId) {
        this.keyloggerUserId = keyloggerUserId;
    }

    public short getIsCurrentTransferMonitored() {
        return isCurrentTransferMonitored;
    }

    public void setIsCurrentTransferMonitored(short isCurrentTransferMonitored) {
        this.isCurrentTransferMonitored = isCurrentTransferMonitored;
    }

    public Integer getCurrentTransferMonitorFrequency() {
        return currentTransferMonitorFrequency;
    }

    public void setCurrentTransferMonitorFrequency(Integer currentTransferMonitorFrequency) {
        this.currentTransferMonitorFrequency = currentTransferMonitorFrequency;
    }

    public short getIsUploadSpeedMonitored() {
        return isUploadSpeedMonitored;
    }

    public void setIsUploadSpeedMonitored(short isUploadSpeedMonitored) {
        this.isUploadSpeedMonitored = isUploadSpeedMonitored;
    }

    public short getIsDownloadSpeedMonitored() {
        return isDownloadSpeedMonitored;
    }

    public void setIsDownloadSpeedMonitored(short isDownloadSpeedMonitored) {
        this.isDownloadSpeedMonitored = isDownloadSpeedMonitored;
    }

    public short getIsNetworkCardInfoMonitor() {
        return isNetworkCardInfoMonitor;
    }

    public void setIsNetworkCardInfoMonitor(short isNetworkCardInfoMonitor) {
        this.isNetworkCardInfoMonitor = isNetworkCardInfoMonitor;
    }

    public Integer getNetworkCardMonitorFrequency() {
        return networkCardMonitorFrequency;
    }

    public void setNetworkCardMonitorFrequency(Integer networkCardMonitorFrequency) {
        this.networkCardMonitorFrequency = networkCardMonitorFrequency;
    }
}
