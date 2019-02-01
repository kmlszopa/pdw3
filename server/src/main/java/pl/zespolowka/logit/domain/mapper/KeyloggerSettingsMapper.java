package pl.zespolowka.logit.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.zespolowka.logit.domain.dto.KeyloggerSettingsDTO;
import pl.zespolowka.logit.domain.model.KeyloggerSettings;

@Mapper
public interface KeyloggerSettingsMapper {

    KeyloggerSettingsMapper INSTANCE = Mappers.getMapper(KeyloggerSettingsMapper.class);

    KeyloggerSettingsDTO map(KeyloggerSettings keyloggerSettings);

    KeyloggerSettings map(KeyloggerSettingsDTO keyloggerSettingsDTO);
}
