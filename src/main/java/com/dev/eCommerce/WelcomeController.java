package com.dev.eCommerce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


    @GetMapping("hello")
    public String hello()
    {
        return "Hello Learners";
    }
}
