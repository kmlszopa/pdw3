package pl.zespolowka.logit.service;

import org.springframework.stereotype.Service;
import pl.zespolowka.logit.domain.dto.KeyloggerUserDTO;
import pl.zespolowka.logit.domain.model.KeyloggerUser;

import java.util.List;


public interface KeyloggerUserService {

    List<KeyloggerUserDTO> getAllKeyloggerUsers();

    KeyloggerUserDTO getKeyloggerUserDTOById(int userId);

    KeyloggerUser getKeyloggerUser(int userId);

    KeyloggerUserDTO create(KeyloggerUserDTO keyLoggerUserDTO);

    KeyloggerUserDTO edit(int userId, KeyloggerUserDTO keyloggerUserDTO);

    KeyloggerUserDTO delete(int userId);
}
