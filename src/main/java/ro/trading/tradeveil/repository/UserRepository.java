package ro.trading.tradeveil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.trading.tradeveil.data.vo.UserVO;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserVO, Long> {
    Optional<UserVO> findById(Long id);
}
