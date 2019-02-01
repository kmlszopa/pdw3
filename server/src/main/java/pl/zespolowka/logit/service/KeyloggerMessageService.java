package pl.zespolowka.logit.service;

import pl.zespolowka.logit.domain.dto.KeyloggerMessageDTO;

import java.util.List;

public interface KeyloggerMessageService {

    List<KeyloggerMessageDTO> getKeyloggerMessages(int userId);
}
