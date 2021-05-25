package com.jh.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@ResponseBody
public class LoginController {
    @RequestMapping(value = "/login")
    public String loginController(){
        return "fafadf";
    }
}
