package com.nest.libraryapp_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class librarycontroller {

    @PostMapping("/")
    public String Adminlogin()
    {
        return "welcome to admin login";
    }

    @PostMapping("/ureg")
    public String Userreg()
    {
        return "welcome to user reg";
    }


}
