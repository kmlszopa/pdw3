package pl.zespolowka.logit.service;

import pl.zespolowka.logit.domain.dto.KeyloggerSettingsDTO;

public interface KeyloggerSettingsService {

    KeyloggerSettingsDTO getKeyloggerUserSettings(int userId);

    KeyloggerSettingsDTO changeIfMessagesShouldMonitored(int keyloggerSettingsId);
}
