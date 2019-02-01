package pl.zespolowka.logit.domain.dto;

import pl.zespolowka.logit.domain.model.KeyloggerUser;

import java.sql.Timestamp;

public class NetworkCardInfoDTO {
    private int id;
    private int keyloggerUsersID;
    private String ineterface;
    private String mac;
    private String ip;
    private String mask;
    private String broadcast;
    private Timestamp whenInfoCollected;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKeyloggerUsersID() {
        return keyloggerUsersID;
    }

    public void setKeyloggerUsersID(int keyloggerUsersID) {
        this.keyloggerUsersID = keyloggerUsersID;
    }

    public String getIneterface() {
        return ineterface;
    }

    public void setIneterface(String ineterface) {
        this.ineterface = ineterface;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(String broadcast) {
        this.broadcast = broadcast;
    }

    public Timestamp getWhenInfoCollected() {
        return whenInfoCollected;
    }

    public void setWhenInfoCollected(Timestamp whenInfoCollected) {
        this.whenInfoCollected = whenInfoCollected;
    }
}
