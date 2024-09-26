package ro.trading.tradeveil.mapper;

import org.mapstruct.Mapper;
import ro.trading.tradeveil.data.dto.AccountDto;
import ro.trading.tradeveil.data.vo.AccountVO;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountDto domainToDto(AccountVO vo);
    AccountVO dtoToDomain(AccountDto dto);
}
