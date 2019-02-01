package pl.zespolowka.logit.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.omg.CORBA.Current;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.zespolowka.logit.domain.dto.CurrentTransferDTO;
import pl.zespolowka.logit.domain.model.CurrentTransfer;
import pl.zespolowka.logit.service.CurrentTransferService;

import static pl.zespolowka.logit.configuration.LogITConsts.API_PATH;
import static pl.zespolowka.logit.configuration.LogITConsts.APPLICATION_JSON;

@RestController
@RequestMapping(value = API_PATH + "/current-transfer", produces = APPLICATION_JSON)
@Api(description = "Current transfer operations")
public class CurrentTransferController {

    @Autowired
    CurrentTransferService currentTransferService;

    @GetMapping("/{userId}")
    @ApiOperation("Find current transfer for given userId")
    public CurrentTransferDTO get(
            @PathVariable int userId) {
        return currentTransferService.getCurrentTransfer(userId);
    }
}
