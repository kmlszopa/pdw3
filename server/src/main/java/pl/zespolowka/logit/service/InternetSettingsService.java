package pl.zespolowka.logit.service;

import pl.zespolowka.logit.domain.dto.InternetSettingsDTO;
import pl.zespolowka.logit.domain.model.InternetSettings;

public interface InternetSettingsService {

    InternetSettingsDTO getKeyloggerUserInternetSettings(int userId);

    InternetSettingsDTO changeCurrentTransferMonitorStatus(int internetSettingsId);

    InternetSettingsDTO setCurrentTransferMonitorFrequency(int internetSettingsId, int frequency);

    InternetSettingsDTO changeUploadSpeedMonitorStatus(int internetSettingsId);

    InternetSettingsDTO changeDownloadSpeedMonitorStatus(int internetSettingsId);

    InternetSettingsDTO changeNetworkCardMonitorStatus(int internetSettingsId);

    InternetSettingsDTO setNetworkCardMonitorFrequency(int internetSettingsId, int frequency);
}
