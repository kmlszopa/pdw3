package pl.zespolowka.logit.domain.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.zespolowka.logit.domain.dto.NetworkCardInfoDTO;
import pl.zespolowka.logit.domain.model.NetworkCardInfo;

@Mapper
public interface NetworkCardInfoMapper {

    NetworkCardInfoMapper INSTANCE = Mappers.getMapper(NetworkCardInfoMapper.class);

    NetworkCardInfoDTO map(NetworkCardInfo  networkCardInfo);

    NetworkCardInfo map(NetworkCardInfoDTO networkCardInfoDTO);

}
