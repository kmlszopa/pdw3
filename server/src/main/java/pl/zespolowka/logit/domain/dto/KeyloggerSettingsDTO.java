package pl.zespolowka.logit.domain.dto;

import pl.zespolowka.logit.domain.model.KeyloggerUser;

public class KeyloggerSettingsDTO {
    private int id;
    private int keyloggerUserId;
    private short areMessagesMonitored;

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

    public short getAreMessagesMonitored() {
        return areMessagesMonitored;
    }

    public void setAreMessagesMonitored(short areMessagesMonitored) {
        this.areMessagesMonitored = areMessagesMonitored;
    }
}
