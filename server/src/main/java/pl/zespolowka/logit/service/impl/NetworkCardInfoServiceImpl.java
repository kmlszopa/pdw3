package pl.zespolowka.logit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.zespolowka.logit.domain.dto.NetworkCardInfoDTO;
import pl.zespolowka.logit.domain.mapper.NetworkCardInfoMapper;
import pl.zespolowka.logit.domain.model.KeyloggerUser;
import pl.zespolowka.logit.domain.model.NetworkCardInfo;
import pl.zespolowka.logit.repository.NetworkCardInfoRepository;
import pl.zespolowka.logit.service.KeyloggerUserService;
import pl.zespolowka.logit.service.NetworkCardInfoService;

import javax.persistence.EntityNotFoundException;

@Service
public class NetworkCardInfoServiceImpl implements NetworkCardInfoService {

    @Autowired
    NetworkCardInfoRepository networkCardInfoRepository;

    @Autowired
    KeyloggerUserService keyloggerUserService;

    @Override
    public NetworkCardInfoDTO getNetworkCardInfo(int userId) {
        KeyloggerUser keyloggerUser = keyloggerUserService.getKeyloggerUser(userId);
        return networkCardInfoRepository
                .findByKeyloggerUser(keyloggerUser)
                .map(NetworkCardInfoMapper.INSTANCE::map)
                .orElseThrow(() -> new EntityNotFoundException("Card info not found"));
    }
}
