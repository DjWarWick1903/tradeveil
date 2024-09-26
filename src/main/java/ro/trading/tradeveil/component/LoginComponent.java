package ro.trading.tradeveil.component;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import ro.trading.tradeveil.data.dto.AccountDto;
import ro.trading.tradeveil.service.AccountService;

@Component
public class LoginComponent {

    private final AccountService accountService;

    public LoginComponent(AccountService accountService) {
        this.accountService = accountService;
    }

    public String validateLogin(AccountDto account, BindingResult bindingResult, Model model, HttpServletRequest request) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("account", account);
            model.addAttribute("error", "There was a problem with your login details");
            return "Login/Login";
        }

        AccountDto accountDto = accountService.findByEmail(account.getEmail());

        if(accountDto == null) {
            model.addAttribute("account", account);
            model.addAttribute("error", "Account not found");
            return "Login/Login";
        }

        request.getSession().setAttribute("account", accountDto);
        return "redirect:/dashboard";
    }

    public String signUp(AccountDto account, BindingResult bindingResult, Model model, HttpServletRequest request) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("account", account);
            model.addAttribute("error", "There was a problem with your credentials");
            return "Login/Signup";
        }

        if(accountService.findByEmail(account.getEmail()) != null) {
            model.addAttribute("account", account);
            model.addAttribute("error", "Account already exists");
            return "Login/Signup";
        }

        accountService.createAccount(account);
        request.getSession().setAttribute("account", account);
        return "redirect:/dashboard";
    }
}
