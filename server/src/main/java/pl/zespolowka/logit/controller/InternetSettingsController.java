package pl.zespolowka.logit.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.zespolowka.logit.domain.dto.InternetSettingsDTO;
import pl.zespolowka.logit.domain.model.InternetSettings;
import pl.zespolowka.logit.service.InternetSettingsService;

import static pl.zespolowka.logit.configuration.LogITConsts.API_PATH;
import static pl.zespolowka.logit.configuration.LogITConsts.APPLICATION_JSON;

@RestController
@RequestMapping(value = API_PATH + "/internet-settings", produces = APPLICATION_JSON)
public class InternetSettingsController {

    @Autowired
    InternetSettingsService internetSettingsService;

    @GetMapping("/{userId}")
    @ApiOperation("Find user settings by user id")
    public InternetSettingsDTO getInternetSettings(@PathVariable int userId) {
        return internetSettingsService.getKeyloggerUserInternetSettings(userId);
    }

    @PutMapping("/{id}/change-current-transfer-monitor-status")
    @ApiOperation("Change current transfer monitor status")
    public InternetSettingsDTO changeCurrentTransferMonitorStatus(@PathVariable int id) {
        return internetSettingsService.changeCurrentTransferMonitorStatus(id);
    }

    @PutMapping("/{id}/current-transfer-monitor-frequency")
    @ApiOperation("Set current transfer monitor frequency")
    public InternetSettingsDTO setCurrentTransferMonitorFrequency(@PathVariable int id, @RequestParam int frequency) {
        return internetSettingsService.setCurrentTransferMonitorFrequency(id, frequency);
    }

    @PutMapping("/{id}/change-upload-speed-monitor-status")
    @ApiOperation("Change upload speed monitor status")
    public InternetSettingsDTO changeUploadSpeedMonitorStatus(@PathVariable int id) {
        return internetSettingsService.changeUploadSpeedMonitorStatus(id);
    }

    @PutMapping("/{id}/change-download-speed-monitor-status")
    @ApiOperation("Change download speed monitor status")
    public InternetSettingsDTO changeDownloadSpeedMonitorStatus(@PathVariable int id) {
        return internetSettingsService.changeDownloadSpeedMonitorStatus(id);
    }

    @PutMapping("/{id}/change-network-card-monitor-status")
    @ApiOperation("Change if network card should be monitored")
    public InternetSettingsDTO changeNetworkCardMonitorStatus(@PathVariable int id) {
        return internetSettingsService.changeNetworkCardMonitorStatus(id);
    }

    @PutMapping("/{id}/network-card-monitor-frequency")
    @ApiOperation("Set network card monitor frequency")
    public InternetSettingsDTO setNetworkCardMonitorFrequency(@PathVariable int id, @PathVariable int frequency) {
        return internetSettingsService.setNetworkCardMonitorFrequency(id, frequency);
    }

}
