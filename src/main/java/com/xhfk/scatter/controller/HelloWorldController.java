package com.xhfk.scatter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/helloword")
    public String index() {
        System.out.println("'helloword4'");
        return "helloword4";
    }
}
