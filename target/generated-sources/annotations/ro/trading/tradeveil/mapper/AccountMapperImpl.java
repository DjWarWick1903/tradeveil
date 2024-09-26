package ro.trading.tradeveil.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ro.trading.tradeveil.data.dto.AccountDto;
import ro.trading.tradeveil.data.dto.UserDto;
import ro.trading.tradeveil.data.vo.AccountVO;
import ro.trading.tradeveil.data.vo.UserVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-26T03:12:13+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.2 (Amazon.com Inc.)"
)
@Component
public class AccountMapperImpl implements AccountMapper {

    @Override
    public AccountDto domainToDto(AccountVO vo) {
        if ( vo == null ) {
            return null;
        }

        AccountDto accountDto = new AccountDto();

        accountDto.setId( vo.getId() );
        accountDto.setEmail( vo.getEmail() );
        accountDto.setPassword( vo.getPassword() );
        accountDto.setUser( userVOToUserDto( vo.getUser() ) );

        return accountDto;
    }

    @Override
    public AccountVO dtoToDomain(AccountDto dto) {
        if ( dto == null ) {
            return null;
        }

        AccountVO accountVO = new AccountVO();

        accountVO.setId( dto.getId() );
        accountVO.setEmail( dto.getEmail() );
        accountVO.setPassword( dto.getPassword() );
        accountVO.setUser( userDtoToUserVO( dto.getUser() ) );

        return accountVO;
    }

    protected UserDto userVOToUserDto(UserVO userVO) {
        if ( userVO == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( userVO.getId() );
        userDto.setFirstName( userVO.getFirstName() );
        userDto.setLastName( userVO.getLastName() );

        return userDto;
    }

    protected UserVO userDtoToUserVO(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserVO userVO = new UserVO();

        userVO.setId( userDto.getId() );
        userVO.setFirstName( userDto.getFirstName() );
        userVO.setLastName( userDto.getLastName() );

        return userVO;
    }
}
