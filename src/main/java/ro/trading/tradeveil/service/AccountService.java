package ro.trading.tradeveil.service;

import org.springframework.stereotype.Service;
import ro.trading.tradeveil.data.dto.AccountDto;
import ro.trading.tradeveil.mapper.AccountMapper;
import ro.trading.tradeveil.repository.AccountRepository;
import ro.trading.tradeveil.data.vo.AccountVO;

@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    public AccountService(AccountRepository accountRepository, AccountMapper accountMapper) {
        this.accountRepository = accountRepository;
        this.accountMapper = accountMapper;
    }

    public AccountDto createAccount(AccountDto account) {
        AccountVO accountVO = accountMapper.dtoToDomain(account);
        accountVO = accountRepository.save(accountVO);
        return accountMapper.domainToDto(accountVO);
    }

    public AccountDto findByEmail(String email) {
        AccountVO accountVO = accountRepository.findByEmail(email).orElse(null);
        return accountMapper.domainToDto(accountVO);
    }
}
