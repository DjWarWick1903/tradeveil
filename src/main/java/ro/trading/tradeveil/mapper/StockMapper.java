package ro.trading.tradeveil.mapper;

import org.mapstruct.Mapper;
import ro.trading.tradeveil.data.dto.StockDto;
import ro.trading.tradeveil.data.vo.StockVO;

@Mapper(componentModel = "spring")
public interface StockMapper {
    StockDto domainToDto(StockVO vo);
    StockVO dtoToDomain(StockDto dto);
}
