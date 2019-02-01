package pl.zespolowka.logit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.zespolowka.logit.domain.dto.InternetSettingsDTO;
import pl.zespolowka.logit.domain.mapper.InternetSettingsMapper;
import pl.zespolowka.logit.domain.model.InternetSettings;
import pl.zespolowka.logit.domain.model.KeyloggerUser;
import pl.zespolowka.logit.repository.InternetSettingsRepository;
import pl.zespolowka.logit.service.InternetSettingsService;
import pl.zespolowka.logit.service.KeyloggerUserService;
import pl.zespolowka.logit.utils.PostgreBoolean;

import javax.persistence.EntityNotFoundException;

@Service
public class InternetSettingsServiceImpl implements InternetSettingsService {

    @Autowired
    InternetSettingsRepository internetSettingsRepository;

    @Autowired
    KeyloggerUserService keyloggerUserService;

    @Override
    public InternetSettingsDTO getKeyloggerUserInternetSettings(int userId) {
        KeyloggerUser keyloggerUser = keyloggerUserService.getKeyloggerUser(userId);
        return internetSettingsRepository
                .findByKeyloggerUser(keyloggerUser)
                .map(InternetSettingsMapper.INSTANCE::map)
                .orElseThrow(() -> new EntityNotFoundException("Internet settings not found"));
    }

    @Override
    public InternetSettingsDTO changeCurrentTransferMonitorStatus(int internetSettingsId) {
        InternetSettings internetSettings = getInternetSettings(internetSettingsId);
        internetSettings.setIsCurrentTransferMonitored(PostgreBoolean.changeBoolean(internetSettings.getIsCurrentTransferMonitored()));
        return saveFlushAndReturnDTO(internetSettings);
    }

    @Override
    public InternetSettingsDTO setCurrentTransferMonitorFrequency(int internetSettingsId, int frequency) {
        InternetSettings internetSettings = getInternetSettings(internetSettingsId);
        internetSettings.setCurrentTransferMonitorFrequency(frequency);
        return saveFlushAndReturnDTO(internetSettings);
    }

    @Override
    public InternetSettingsDTO changeUploadSpeedMonitorStatus(int internetSettingsId) {
        InternetSettings internetSettings = getInternetSettings(internetSettingsId);
        internetSettings.setIsUploadSpeedMonitored(PostgreBoolean.changeBoolean(internetSettings.getIsUploadSpeedMonitored()));
        return saveFlushAndReturnDTO(internetSettings);
    }

    @Override
    public InternetSettingsDTO changeDownloadSpeedMonitorStatus(int internetSettingsId) {
        InternetSettings internetSettings = getInternetSettings(internetSettingsId);
        internetSettings.setIsDownloadSpeedMonitored(PostgreBoolean.changeBoolean(internetSettings.getIsDownloadSpeedMonitored()));
        return saveFlushAndReturnDTO(internetSettings);
    }


    @Override
    public InternetSettingsDTO changeNetworkCardMonitorStatus(int internetSettingsId) {
        InternetSettings internetSettings = getInternetSettings(internetSettingsId);
        internetSettings.setIsNetworkCardInfoMonitor(internetSettings.getIsNetworkCardInfoMonitor());
        return saveFlushAndReturnDTO(internetSettings);
    }

    @Override
    public InternetSettingsDTO setNetworkCardMonitorFrequency(int internetSettingsId, int frequency) {
        InternetSettings internetSettings = getInternetSettings(internetSettingsId);
        internetSettings.setNetworkCardMonitorFrequency(frequency);
        return saveFlushAndReturnDTO(internetSettings);
    }

    private InternetSettings getInternetSettings(int internetSettingsId) {
        return internetSettingsRepository.findById(internetSettingsId).orElseThrow(() -> new EntityNotFoundException("Internet settings not found"));
    }

    private InternetSettingsDTO saveFlushAndReturnDTO(InternetSettings internetSettings) {
        internetSettingsRepository.saveAndFlush(internetSettings);
        return InternetSettingsMapper.INSTANCE.map(internetSettings);
    }
}
