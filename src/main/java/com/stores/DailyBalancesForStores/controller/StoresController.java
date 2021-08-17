package com.stores.DailyBalancesForStores.controller;

import com.stores.DailyBalancesForStores.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StoresController {

    @Autowired
    private ProductServices productServices;

    @RequestMapping("/")
    private String home(Model model) {

        model.addAttribute("LDPE", productServices.getProductsByType("LDPE"));
        model.addAttribute("LLDPE", productServices.getProductsByType("LLDPE"));
        model.addAttribute("HDPE", productServices.getProductsByType("HDPE"));
        model.addAttribute("PVC", productServices.getProductsByType("PVC"));

        return "home";
    }
}
