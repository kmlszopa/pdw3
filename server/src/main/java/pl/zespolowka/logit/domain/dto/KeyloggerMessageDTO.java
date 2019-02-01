package pl.zespolowka.logit.domain.dto;

import java.sql.Timestamp;

public class KeyloggerMessageDTO {
    private int id;
    private int keyloggerUserId;
    private String message;
    private Timestamp messageTimestamp;

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Timestamp getMessageTimestamp() {
        return messageTimestamp;
    }

    public void setMessageTimestamp(Timestamp messageTimestamp) {
        this.messageTimestamp = messageTimestamp;
    }
}
