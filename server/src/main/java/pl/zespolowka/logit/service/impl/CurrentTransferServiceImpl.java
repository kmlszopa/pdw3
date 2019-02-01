package pl.zespolowka.logit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.zespolowka.logit.domain.dto.CurrentTransferDTO;
import pl.zespolowka.logit.domain.mapper.CurrentTransferMapper;
import pl.zespolowka.logit.domain.model.CurrentTransfer;
import pl.zespolowka.logit.domain.model.KeyloggerUser;
import pl.zespolowka.logit.repository.CurrentTransferRepository;
import pl.zespolowka.logit.repository.KeyloggerUserRepository;
import pl.zespolowka.logit.service.CurrentTransferService;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

import static java.util.Objects.nonNull;

@Service
public class CurrentTransferServiceImpl implements CurrentTransferService {

    @Autowired
    CurrentTransferRepository currentTransferRepository;

    @Autowired
    KeyloggerUserRepository keyloggerUserRepository;

    @Override
    public CurrentTransferDTO getCurrentTransfer(int userId) {
        Optional<KeyloggerUser> user = keyloggerUserRepository.findById(userId);
        //TODO ogarnij optionale
        return currentTransferRepository.findByKeyloggerUser(user.get())
                .map(CurrentTransferMapper.INSTANCE::map).orElseThrow(() -> new EntityNotFoundException("Current transfer not found"));
    }
}
