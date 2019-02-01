package pl.zespolowka.logit.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import pl.zespolowka.logit.domain.dto.KeyloggerUserDTO;
import pl.zespolowka.logit.service.KeyloggerUserService;

import java.util.List;

import static pl.zespolowka.logit.configuration.LogITConsts.API_PATH;
import static pl.zespolowka.logit.configuration.LogITConsts.APPLICATION_JSON;

@RestController
@RequestMapping(value = API_PATH + "/keylogger-users", produces = APPLICATION_JSON)
public class KeyloggerUserController {

    @Autowired
    KeyloggerUserService keyloggerUserService;

    @GetMapping
    @ApiOperation("Find all keylogger users")
    public List<KeyloggerUserDTO> getAllKeyloggerUsers(
            @PageableDefault (size = 100, sort = {"id"}, direction = Sort.Direction.DESC)Pageable pageable) {
        return keyloggerUserService.getAllKeyloggerUsers();
    }

    @GetMapping("/{userId}")
    @ApiOperation("Find keylogger user by id")
    public KeyloggerUserDTO getKeyloggerUserById(
            @PathVariable int userId){
        return keyloggerUserService.getKeyloggerUserDTOById(userId);
    }

    @PostMapping
    @ApiOperation("Add user")
    public KeyloggerUserDTO create(@RequestBody KeyloggerUserDTO keyLoggerUserDTO){
        return keyloggerUserService.create(keyLoggerUserDTO);
    }

    @PostMapping("/{userId}")
    @ApiOperation("Edit user")
    public KeyloggerUserDTO edit(@PathVariable int userId, @RequestBody KeyloggerUserDTO keyloggerUserDTO){
        return keyloggerUserService.edit(userId, keyloggerUserDTO);
    }

    @DeleteMapping("/{userId}")
    @ApiOperation("Delete user")
    public KeyloggerUserDTO delete(@PathVariable int userId){
        return keyloggerUserService.delete(userId);
    }
}
