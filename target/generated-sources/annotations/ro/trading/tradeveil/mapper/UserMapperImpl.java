package ro.trading.tradeveil.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ro.trading.tradeveil.data.dto.UserDto;
import ro.trading.tradeveil.data.vo.UserVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-26T03:12:13+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.2 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto domainToDto(UserVO vo) {
        if ( vo == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( vo.getId() );
        userDto.setFirstName( vo.getFirstName() );
        userDto.setLastName( vo.getLastName() );

        return userDto;
    }

    @Override
    public UserVO dtoToDomain(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        UserVO userVO = new UserVO();

        userVO.setId( dto.getId() );
        userVO.setFirstName( dto.getFirstName() );
        userVO.setLastName( dto.getLastName() );

        return userVO;
    }
}
