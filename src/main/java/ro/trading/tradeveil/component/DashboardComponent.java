package ro.trading.tradeveil.component;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import ro.trading.tradeveil.data.dto.AccountDto;
import ro.trading.tradeveil.data.model.DashboardData;
import ro.trading.tradeveil.service.StockService;

import java.util.List;

@Component
public class DashboardComponent {

    private final StockService stockService;
    public DashboardComponent(StockService stockService) {
        this.stockService = stockService;
    }

    public String getDashboard(Model model, HttpServletRequest request) {
        AccountDto account = (AccountDto) request.getSession().getAttribute("account");
        if(account == null) {
            return "redirect:/login";
        }

        final List<DashboardData> stocks = stockService.getDashboardData();
        model.addAttribute("stocks", stocks);
        model.addAttribute("fullName", account.getFullName());
        return "Main/Dashboard";
    }
}
