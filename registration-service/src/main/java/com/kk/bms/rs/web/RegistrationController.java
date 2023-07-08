package com.kk.bms.rs.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RegistrationController {

    @GetMapping("/greet")
    public String greet(){
        return "Hello";
    }
}
