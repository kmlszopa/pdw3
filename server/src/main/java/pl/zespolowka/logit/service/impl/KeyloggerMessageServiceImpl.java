package pl.zespolowka.logit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.zespolowka.logit.domain.dto.KeyloggerMessageDTO;
import pl.zespolowka.logit.domain.mapper.KeyloggerMessageMapper;
import pl.zespolowka.logit.domain.model.KeyloggerMessage;
import pl.zespolowka.logit.domain.model.KeyloggerUser;
import pl.zespolowka.logit.repository.KeyloggerMessageRepository;
import pl.zespolowka.logit.service.KeyloggerMessageService;
import pl.zespolowka.logit.service.KeyloggerUserService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KeyloggerMessageServiceImpl implements KeyloggerMessageService {

    @Autowired
    KeyloggerMessageRepository keyloggerMessageRepository;

    @Autowired
    KeyloggerUserService keyloggerUserService;

    @Override
    public List<KeyloggerMessageDTO> getKeyloggerMessages(int userId) {
        KeyloggerUser keyloggerUser = keyloggerUserService.getKeyloggerUser(userId);
        return keyloggerMessageRepository
                .findAllByKeyloggerUser(keyloggerUser)
                .stream()
                .map(KeyloggerMessageMapper.INSTANCE::map)
                .collect(Collectors.toList());
    }
}
