package com.app.artsys.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {

    @GetMapping("/dashboard")
    public String adminDashboard(Model model) {
        model.addAttribute("totalUsers", 145);
        model.addAttribute("avgWaitTime", "24 часа");
        return "admin";
    }
}
