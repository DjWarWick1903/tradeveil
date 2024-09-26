package ro.trading.tradeveil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ro.trading.tradeveil.data.vo.AlarmVO;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlarmRepository extends JpaRepository<AlarmVO, Long> {
    @Query("SELECT a FROM AlarmVO a WHERE a.user.id = :userId AND a.stock.id = :stockId AND a.isActive = true")
    Optional<AlarmVO> findByUserAndStock(@Param("userId") Long userId, @Param("stockId") Long stockId);

    @Query("SELECT a FROM AlarmVO a WHERE a.user.id = :userId AND a.isActive = true")
    List<AlarmVO> findAllUserAlarms();

    void delete(AlarmVO alarm);
    AlarmVO save(AlarmVO alarm);
}
