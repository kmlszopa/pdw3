package pl.zespolowka.logit.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.zespolowka.logit.domain.dto.KeyloggerSettingsDTO;
import pl.zespolowka.logit.service.KeyloggerSettingsService;

import static pl.zespolowka.logit.configuration.LogITConsts.API_PATH;
import static pl.zespolowka.logit.configuration.LogITConsts.APPLICATION_JSON;

@RestController
@RequestMapping(value = API_PATH + "/keylogger-settings", produces = APPLICATION_JSON)
public class KeyloggerSettingsController {

    @Autowired
    KeyloggerSettingsService keyloggerSettingsService;

    @GetMapping("/{userId}")
    @ApiOperation("Find keylogger settings by user id")
    public KeyloggerSettingsDTO getKeyloggerSettings(@PathVariable int userId){
        return keyloggerSettingsService.getKeyloggerUserSettings(userId);
    }

    @PutMapping("/{settingsId}/change-messages-monitor")
    @ApiOperation("Change if messages of given user id should be monitored")
    public KeyloggerSettingsDTO changeMessagesMonitorStatus(@PathVariable int settingsId){
        return keyloggerSettingsService.changeIfMessagesShouldMonitored(settingsId);
    }
}
