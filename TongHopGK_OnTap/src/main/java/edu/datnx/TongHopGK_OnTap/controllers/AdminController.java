package edu.datnx.TongHopGK_OnTap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AdminController {

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        model.addAttribute("title", "Admin Dashboard");
        model.addAttribute("totalUsers", 200);
        model.addAttribute("totalOrders", 50);
        return "pages/dashboard";
    }
}
