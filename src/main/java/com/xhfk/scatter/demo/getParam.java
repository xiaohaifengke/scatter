package com.xhfk.scatter.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getParam {
    @RequestMapping(path = {"/get-param/{id}"})
    public String HelloSpring (@PathVariable("id") String userId){
        System.out.println("get param " + userId);
        return "{\"a\":\"bc\", \"userId\":" +userId+ "}";
    }
}
