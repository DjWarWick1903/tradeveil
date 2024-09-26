package ro.trading.tradeveil.mapper;

import org.mapstruct.Mapper;
import ro.trading.tradeveil.data.dto.UserDto;
import ro.trading.tradeveil.data.vo.UserVO;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto domainToDto(UserVO vo);
    UserVO dtoToDomain(UserDto dto);
}
