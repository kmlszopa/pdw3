package pl.zespolowka.logit.service;

import pl.zespolowka.logit.domain.dto.CurrentTransferDTO;
import pl.zespolowka.logit.domain.model.CurrentTransfer;

public interface CurrentTransferService {
    CurrentTransferDTO getCurrentTransfer(int userId);
}
