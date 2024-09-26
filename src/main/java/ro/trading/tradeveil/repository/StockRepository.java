package ro.trading.tradeveil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.trading.tradeveil.data.vo.StockVO;

import java.util.List;

public interface StockRepository extends JpaRepository<StockVO, Long> {
    List<StockVO> findAll();
}
