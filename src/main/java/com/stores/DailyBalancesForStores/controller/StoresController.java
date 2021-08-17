package com.stores.DailyBalancesForStores.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StoresController {

    @ResponseBody
    @RequestMapping("/")
    public String home() {
        return "home";
    }
}
