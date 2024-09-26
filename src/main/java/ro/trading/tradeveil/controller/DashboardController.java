package ro.trading.tradeveil.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ro.trading.tradeveil.component.DashboardComponent;

@Controller
public class DashboardController {
    private final DashboardComponent dashboardComponent;
    private final HttpServletRequest request;

    public DashboardController(DashboardComponent dashboardComponent, HttpServletRequest request) {
        this.request = request;
        this.dashboardComponent = dashboardComponent;
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        return dashboardComponent.getDashboard(model, request);
    }
}
