package com.bmeme.springauth0demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(
        origins = "*",
        methods = {RequestMethod.OPTIONS, RequestMethod.GET, RequestMethod.HEAD},
        allowedHeaders = "*")
@RestController
public class InfoController {

    @GetMapping("/public")
    public String getInfo() {

        return "Public information from Evil Corporation Mainframe";
    }

    @GetMapping("/private")
    public String getPrivateInfo() {

        return "Private information from Evil Corporation Mainframe, requires base login";
    }

    @GetMapping("/payments")
    public String getPayments() {

        return "Payments data from Evil Corporation Mainframe, requires login and 'read:payment' permission";
    }
}
