package pl.zespolowka.logit.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.zespolowka.logit.domain.dto.KeyloggerUserDTO;
import pl.zespolowka.logit.domain.model.KeyloggerUser;

@Mapper
public interface KeyloggerUserMapper {
    KeyloggerUserMapper INSTANCE = Mappers.getMapper(KeyloggerUserMapper.class);

    KeyloggerUserDTO map(KeyloggerUser keyloggerUser);

    KeyloggerUser map(KeyloggerUserDTO keyloggerUserDTO);
}
