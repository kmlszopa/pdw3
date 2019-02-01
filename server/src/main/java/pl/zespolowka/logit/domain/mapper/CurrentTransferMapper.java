package pl.zespolowka.logit.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.zespolowka.logit.domain.dto.CurrentTransferDTO;
import pl.zespolowka.logit.domain.model.CurrentTransfer;

@Mapper
public interface CurrentTransferMapper {
    CurrentTransferMapper INSTANCE = Mappers.getMapper(CurrentTransferMapper.class);

    CurrentTransferDTO map(CurrentTransfer currentTransfer);

    CurrentTransfer map(CurrentTransferDTO currentTransferDTO);
}
