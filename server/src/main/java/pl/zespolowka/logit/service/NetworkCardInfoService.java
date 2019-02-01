package pl.zespolowka.logit.service;

import pl.zespolowka.logit.domain.dto.NetworkCardInfoDTO;

public interface NetworkCardInfoService {

    NetworkCardInfoDTO getNetworkCardInfo(int userId);
}
