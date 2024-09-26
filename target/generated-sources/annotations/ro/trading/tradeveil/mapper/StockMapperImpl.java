package ro.trading.tradeveil.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ro.trading.tradeveil.data.dto.StockDto;
import ro.trading.tradeveil.data.vo.StockVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-26T03:12:13+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.2 (Amazon.com Inc.)"
)
@Component
public class StockMapperImpl implements StockMapper {

    @Override
    public StockDto domainToDto(StockVO vo) {
        if ( vo == null ) {
            return null;
        }

        StockDto stockDto = new StockDto();

        stockDto.setId( vo.getId() );
        stockDto.setSymbol( vo.getSymbol() );
        stockDto.setName( vo.getName() );

        return stockDto;
    }

    @Override
    public StockVO dtoToDomain(StockDto dto) {
        if ( dto == null ) {
            return null;
        }

        StockVO stockVO = new StockVO();

        stockVO.setId( dto.getId() );
        stockVO.setSymbol( dto.getSymbol() );
        stockVO.setName( dto.getName() );

        return stockVO;
    }
}
