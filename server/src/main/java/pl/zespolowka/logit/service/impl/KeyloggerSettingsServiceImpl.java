package pl.zespolowka.logit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.zespolowka.logit.domain.dto.KeyloggerSettingsDTO;
import pl.zespolowka.logit.domain.mapper.KeyloggerSettingsMapper;
import pl.zespolowka.logit.domain.model.KeyloggerSettings;
import pl.zespolowka.logit.domain.model.KeyloggerUser;
import pl.zespolowka.logit.repository.KeyloggerSettingsRepository;
import pl.zespolowka.logit.service.KeyloggerSettingsService;
import pl.zespolowka.logit.service.KeyloggerUserService;
import pl.zespolowka.logit.utils.PostgreBoolean;

import javax.persistence.EntityNotFoundException;

@Service
public class KeyloggerSettingsServiceImpl implements KeyloggerSettingsService {

    @Autowired
    KeyloggerSettingsRepository keyloggerSettingsRepository;

    @Autowired
    KeyloggerUserService keyloggerUserService;

    @Override
    public KeyloggerSettingsDTO getKeyloggerUserSettings(int userId) {
        KeyloggerUser keyloggerUser = keyloggerUserService.getKeyloggerUser(userId);
        return keyloggerSettingsRepository
                .findByKeyloggerUser(keyloggerUser)
                .map(KeyloggerSettingsMapper.INSTANCE::map)
                .orElseThrow(() -> new EntityNotFoundException("Keylogger settings not found"));
    }

    @Override
    public KeyloggerSettingsDTO changeIfMessagesShouldMonitored(int keyloggerSettingsId) {
        KeyloggerSettings keyloggerSettings = getKeyloggerSettings(keyloggerSettingsId);
        keyloggerSettings.setAreMessagesMonitored(PostgreBoolean.changeBoolean(keyloggerSettings.getAreMessagesMonitored()));
        return saveFlushAndReturnDTO(keyloggerSettings);
    }

    private KeyloggerSettingsDTO saveFlushAndReturnDTO(KeyloggerSettings keyloggerSettings) {
        keyloggerSettingsRepository.saveAndFlush(keyloggerSettings);
        return KeyloggerSettingsMapper.INSTANCE.map(keyloggerSettings);
    }

    private KeyloggerSettings getKeyloggerSettings(int keyloggerSettingsId) {
        return keyloggerSettingsRepository.findById(keyloggerSettingsId).orElseThrow(() -> new EntityNotFoundException("Keylogger settings not found"));
    }
}
