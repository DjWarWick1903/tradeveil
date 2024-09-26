package ro.trading.tradeveil.data.dto;

public class AlarmDto {
    private Long id;
    private Double price;
    private Boolean isPercentage;
    private Short difference;
    private Boolean isActive;
    private UserDto user;
    private StockDto stock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getPercentage() {
        return isPercentage;
    }

    public void setPercentage(Boolean percentage) {
        isPercentage = percentage;
    }

    public Short getDifference() {
        return difference;
    }

    public void setDifference(Short difference) {
        this.difference = difference;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public StockDto getStock() {
        return stock;
    }

    public void setStock(StockDto stock) {
        this.stock = stock;
    }
}
