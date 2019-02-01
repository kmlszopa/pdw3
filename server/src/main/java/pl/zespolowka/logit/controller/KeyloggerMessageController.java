package pl.zespolowka.logit.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.zespolowka.logit.domain.dto.KeyloggerMessageDTO;
import pl.zespolowka.logit.domain.model.KeyloggerMessage;
import pl.zespolowka.logit.service.KeyloggerMessageService;

import java.util.List;

import static pl.zespolowka.logit.configuration.LogITConsts.API_PATH;
import static pl.zespolowka.logit.configuration.LogITConsts.APPLICATION_JSON;

@RestController
@RequestMapping(value = API_PATH + "/messages", produces = APPLICATION_JSON)
public class KeyloggerMessageController {

    @Autowired
    KeyloggerMessageService keyloggerMessageService;

    @GetMapping("/{userId}")
    @ApiOperation("Get all user messages")
    public List<KeyloggerMessageDTO> getKeyloggerUserMessages(@PathVariable int userId){
        return  keyloggerMessageService.getKeyloggerMessages(userId);
    }
}
