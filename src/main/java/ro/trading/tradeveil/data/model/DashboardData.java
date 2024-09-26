package ro.trading.tradeveil.data.model;

import ro.trading.tradeveil.data.dto.StockDto;

public class DashboardData {
    private StockDto stock;
    private Long price;

    public DashboardData() {}

    public DashboardData(StockDto stock, Long price) {
        this.stock = stock;
        this.price = price;
    }

    public StockDto getStock() {
        return stock;
    }

    public void setStock(StockDto stock) {
        this.stock = stock;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
