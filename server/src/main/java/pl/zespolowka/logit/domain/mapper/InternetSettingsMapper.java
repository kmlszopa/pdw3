package pl.zespolowka.logit.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.zespolowka.logit.domain.dto.InternetSettingsDTO;
import pl.zespolowka.logit.domain.model.InternetSettings;

@Mapper
public interface InternetSettingsMapper {
    InternetSettingsMapper INSTANCE = Mappers.getMapper(InternetSettingsMapper.class);

    InternetSettingsDTO map(InternetSettings internetSettings);

    InternetSettings map(InternetSettingsDTO internetSettingsDTO);
}
