package ro.trading.tradeveil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.trading.tradeveil.data.vo.AccountVO;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<AccountVO, Long> {
    Optional<AccountVO> findByEmail(String email);
    AccountVO save(AccountVO account);
}
