package pl.zespolowka.logit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.zespolowka.logit.domain.dto.KeyloggerUserDTO;
import pl.zespolowka.logit.domain.mapper.KeyloggerUserMapper;
import pl.zespolowka.logit.domain.model.KeyloggerUser;
import pl.zespolowka.logit.repository.KeyloggerUserRepository;
import pl.zespolowka.logit.service.KeyloggerUserService;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class KeyloggerUserServiceImpl implements KeyloggerUserService {

    @Autowired
    KeyloggerUserRepository keyloggerUserRepository;

    @Override
    public List<KeyloggerUserDTO> getAllKeyloggerUsers() {
        return keyloggerUserRepository
                .findAll()
                .stream()
                .map(KeyloggerUserMapper.INSTANCE::map)
                .collect(Collectors.toList());
    }

    @Override
    public KeyloggerUserDTO getKeyloggerUserDTOById(int userId) {
        return keyloggerUserRepository
                .findById(userId)
                .map(KeyloggerUserMapper.INSTANCE::map)
                //TODO ogarnac exceptiony(DTO?)
                .orElseThrow(() -> new EntityNotFoundException("User Not Found"));
    }

    @Override
    public KeyloggerUser getKeyloggerUser(int userId) {
        return keyloggerUserRepository
                .findById(userId)
                .orElseThrow(() -> new EntityNotFoundException("User Not Found"));
    }

    @Override
    public KeyloggerUserDTO create(KeyloggerUserDTO keyloggerUserDTO) {
        KeyloggerUser keyloggerUser = KeyloggerUserMapper.INSTANCE.map(keyloggerUserDTO);
        keyloggerUserRepository.save(keyloggerUser);
        return KeyloggerUserMapper.INSTANCE.map(keyloggerUser);
    }

    @Override
    public KeyloggerUserDTO edit(int userId, KeyloggerUserDTO keyloggerUserDTO) {
        keyloggerUserDTO.setId(userId);
        keyloggerUserRepository.save(KeyloggerUserMapper.INSTANCE.map(keyloggerUserDTO));
        return keyloggerUserDTO;
    }

    @Override
    public KeyloggerUserDTO delete(int userId) {
        KeyloggerUser user = keyloggerUserRepository
                .findById(userId)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));
        keyloggerUserRepository.delete(user);
        return KeyloggerUserMapper.INSTANCE.map(user);
    }
}
