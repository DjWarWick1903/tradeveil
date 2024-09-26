package ro.trading.tradeveil.data.dto;

public class AccountDto {
    private Long id;
    private String email;
    private String password;
    private UserDto user;

    public String getFullName() {
        return user.getFirstName() + " " + user.getLastName();
    }

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

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
