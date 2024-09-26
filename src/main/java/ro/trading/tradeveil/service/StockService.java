package ro.trading.tradeveil.service;

import org.springframework.stereotype.Service;
import ro.trading.tradeveil.data.model.DashboardData;
import ro.trading.tradeveil.mapper.StockMapper;
import ro.trading.tradeveil.repository.StockRepository;

import java.util.List;

@Service
public class StockService {
    private final StockRepository stockRepository;
    private final StockMapper stockMapper;

    public StockService(StockRepository stockRepository, StockMapper stockMapper) {
        this.stockMapper = stockMapper;
        this.stockRepository = stockRepository;
    }

    public List<DashboardData> getDashboardData() {
        return stockRepository.findAll()
                .stream()
                .map(stockMapper::domainToDto)
                .map(stock -> new DashboardData(stock, 0L))
                .toList();
    }
}
