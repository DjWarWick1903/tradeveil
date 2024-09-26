package ro.trading.tradeveil.data.vo;

import jakarta.persistence.*;

@Entity
@Table(name = "ALARMS")
public class AlarmVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "PRICE")
    private Double price;
    @Column(name = "PERCENTAGE")
    private Boolean isPercentage;
    @Column(name = "DIFFERENCE")
    private Short difference;
    @Column(name = "ACTIVE")
    private Boolean isActive;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USERID", referencedColumnName = "ID")
    private UserVO user;
    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "STOCKID", referencedColumnName = "ID")
    private StockVO stock;

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

    public UserVO getUser() {
        return user;
    }

    public void setUser(UserVO user) {
        this.user = user;
    }

    public StockVO getStock() {
        return stock;
    }

    public void setStock(StockVO stock) {
        this.stock = stock;
    }
}
