package com.xhfk.scatter.Service;

import org.springframework.stereotype.Component;

@Component
public class ServiceDemo {
    public String testDemo(){
        String rtnAfterDosomething = "我是返回结果";
        //这里是业务代码
        return rtnAfterDosomething;
    }
}
