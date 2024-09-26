package ro.trading.tradeveil.data.vo;

import jakarta.persistence.*;

@Entity
@Table(name = "ACCOUNTS", schema = "tradeveil")
public class AccountVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USERID", referencedColumnName = "ID")
    private UserVO user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserVO getUser() {
        return user;
    }

    public void setUser(UserVO user) {
        this.user = user;
    }
}
