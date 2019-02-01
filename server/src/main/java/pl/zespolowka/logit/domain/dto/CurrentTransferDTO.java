package pl.zespolowka.logit.domain.dto;

import java.sql.Timestamp;

public class CurrentTransferDTO {
    private int id;
    private int keyloggerUserId;
    private Integer uploadSpeed;
    private Integer downloadSpeed;
    private Timestamp whenStarted;

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

    public Integer getUploadSpeed() {
        return uploadSpeed;
    }

    public void setUploadSpeed(Integer uploadSpeed) {
        this.uploadSpeed = uploadSpeed;
    }

    public Integer getDownloadSpeed() {
        return downloadSpeed;
    }

    public void setDownloadSpeed(Integer downloadSpeed) {
        this.downloadSpeed = downloadSpeed;
    }

    public Timestamp getWhenStarted() {
        return whenStarted;
    }

    public void setWhenStarted(Timestamp whenStarted) {
        this.whenStarted = whenStarted;
    }
}
