package pl.zespolowka.logit.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.zespolowka.logit.domain.dto.KeyloggerMessageDTO;
import pl.zespolowka.logit.domain.model.KeyloggerMessage;

@Mapper
public interface KeyloggerMessageMapper {

    KeyloggerMessageMapper INSTANCE = Mappers.getMapper(KeyloggerMessageMapper.class);

    KeyloggerMessageDTO map(KeyloggerMessage keyloggerMessage);

    KeyloggerMessage map(KeyloggerMessageDTO keyloggerMessageDTO);
}
