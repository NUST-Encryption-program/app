

package com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: xvitcoder
 * Date: 12/21/12
 * Time: 12:23 AM
 */
@Controller
@RequestMapping("/homes")
public class HomeController {



    @RequestMapping("/home")
    public String getCarPartialPage() {
        return "homes/home";
    }
}
