package com.ecom.ShoppingCart.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/login")
    public String login(){
        return "Login";
    }
    @GetMapping("/register")
    public String register(){
        return "Register";
    }

    @GetMapping("/products")
	public String products() {
		return "product";
	}

    @GetMapping("/product")
	public String product() {
		return "view_product";
	}

}
