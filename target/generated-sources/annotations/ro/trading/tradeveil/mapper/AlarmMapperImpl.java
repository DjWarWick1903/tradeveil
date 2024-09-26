package ro.trading.tradeveil.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ro.trading.tradeveil.data.dto.AlarmDto;
import ro.trading.tradeveil.data.dto.StockDto;
import ro.trading.tradeveil.data.dto.UserDto;
import ro.trading.tradeveil.data.vo.AlarmVO;
import ro.trading.tradeveil.data.vo.StockVO;
import ro.trading.tradeveil.data.vo.UserVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-26T03:12:13+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.2 (Amazon.com Inc.)"
)
@Component
public class AlarmMapperImpl implements AlarmMapper {

    @Override
    public AlarmDto domainToDto(AlarmVO vo) {
        if ( vo == null ) {
            return null;
        }

        AlarmDto alarmDto = new AlarmDto();

        alarmDto.setId( vo.getId() );
        alarmDto.setPrice( vo.getPrice() );
        alarmDto.setPercentage( vo.getPercentage() );
        alarmDto.setDifference( vo.getDifference() );
        alarmDto.setActive( vo.getActive() );
        alarmDto.setUser( userVOToUserDto( vo.getUser() ) );
        alarmDto.setStock( stockVOToStockDto( vo.getStock() ) );

        return alarmDto;
    }

    @Override
    public AlarmVO dtoToDomain(AlarmDto dto) {
        if ( dto == null ) {
            return null;
        }

        AlarmVO alarmVO = new AlarmVO();

        alarmVO.setId( dto.getId() );
        alarmVO.setPrice( dto.getPrice() );
        alarmVO.setPercentage( dto.getPercentage() );
        alarmVO.setDifference( dto.getDifference() );
        alarmVO.setActive( dto.getActive() );
        alarmVO.setUser( userDtoToUserVO( dto.getUser() ) );
        alarmVO.setStock( stockDtoToStockVO( dto.getStock() ) );

        return alarmVO;
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

    protected StockDto stockVOToStockDto(StockVO stockVO) {
        if ( stockVO == null ) {
            return null;
        }

        StockDto stockDto = new StockDto();

        stockDto.setId( stockVO.getId() );
        stockDto.setSymbol( stockVO.getSymbol() );
        stockDto.setName( stockVO.getName() );

        return stockDto;
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

    protected StockVO stockDtoToStockVO(StockDto stockDto) {
        if ( stockDto == null ) {
            return null;
        }

        StockVO stockVO = new StockVO();

        stockVO.setId( stockDto.getId() );
        stockVO.setSymbol( stockDto.getSymbol() );
        stockVO.setName( stockDto.getName() );

        return stockVO;
    }
}
