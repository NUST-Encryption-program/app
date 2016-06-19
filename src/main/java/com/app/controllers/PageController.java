package com.app.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/contents/page")
    public String getCarPartialPage() {
        return "/contents/page";
    }
	
}

