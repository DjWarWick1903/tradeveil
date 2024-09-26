package ro.trading.tradeveil.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ro.trading.tradeveil.component.LoginComponent;
import ro.trading.tradeveil.data.dto.AccountDto;

@Controller
public class LoginController {

    private final LoginComponent loginComponent;
    private final HttpServletRequest request;

    public LoginController(LoginComponent loginComponent, HttpServletRequest request) {
        this.request = request;
        this.loginComponent = loginComponent;
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("account", new AccountDto());
        return "Login/Login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute AccountDto account, BindingResult bindingResult, Model model) {
        return loginComponent.validateLogin(account, bindingResult, model, request);
    }

    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("account", new AccountDto());
        return "Login/Signup";
    }

    @PostMapping("/signup/create")
    public String signup(@ModelAttribute AccountDto account, BindingResult bindingResult, Model model) {
        return loginComponent.signUp(account, bindingResult, model, request);
    }
}
