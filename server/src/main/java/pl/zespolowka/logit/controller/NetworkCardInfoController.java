package pl.zespolowka.logit.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.zespolowka.logit.domain.dto.NetworkCardInfoDTO;
import pl.zespolowka.logit.repository.NetworkCardInfoRepository;
import pl.zespolowka.logit.service.NetworkCardInfoService;

import static pl.zespolowka.logit.configuration.LogITConsts.API_PATH;
import static pl.zespolowka.logit.configuration.LogITConsts.APPLICATION_JSON;

@RestController
@RequestMapping(value = API_PATH + "/networkcard-info", produces = APPLICATION_JSON)
public class NetworkCardInfoController {

    @Autowired
    NetworkCardInfoService networkCardInfoService;

    @GetMapping("/{userId}")
    @ApiOperation("Find network card info for given user id")
    public NetworkCardInfoDTO getNetworkCardInfo(@PathVariable int userId){
        return networkCardInfoService.getNetworkCardInfo(userId);
    }


}
