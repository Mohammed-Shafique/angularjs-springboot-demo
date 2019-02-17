package com.shafique.springboot.controller;

import com.shafique.springboot.model.LoginResponse;
import com.shafique.springboot.model.UserDetails;
import com.shafique.springboot.model.UserLogin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/userLogin")
public class LoginController {

    @PostMapping(value = "/login", consumes = "application/json")
    public LoginResponse login(@RequestBody UserLogin userLogin){
        System.out.println(userLogin.getUsername());
        System.out.println(userLogin.getPassword());
        LoginResponse response = new LoginResponse();
        response.setLoginStatus(true);
        response.setMessage("Login Successful");
        return response;
    }

    @PostMapping(value = "/signup", consumes = "application/json")
    public LoginResponse signup(@RequestBody UserDetails userDetails){
        System.out.println(userDetails.getFirstName());
        System.out.println(userDetails.getLastName());
        LoginResponse response = new LoginResponse();
        response.setLoginStatus(true);
        response.setMessage("Login Successful");
        return response;
    }
}
