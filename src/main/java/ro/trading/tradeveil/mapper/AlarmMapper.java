package ro.trading.tradeveil.mapper;

import org.mapstruct.Mapper;
import ro.trading.tradeveil.data.dto.AlarmDto;
import ro.trading.tradeveil.data.vo.AlarmVO;

@Mapper(componentModel = "spring")
public interface AlarmMapper {
    AlarmDto domainToDto(AlarmVO vo);
    AlarmVO dtoToDomain(AlarmDto dto);
}
