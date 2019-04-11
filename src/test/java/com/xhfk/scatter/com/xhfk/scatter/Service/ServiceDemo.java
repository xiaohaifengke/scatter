package com.xhfk.scatter.com.xhfk.scatter.Service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceDemo {
    @Autowired
    ServiceDemo serviceDemo;
    @Test
    public void testDemo() {
//        String rtn = serviceDemo.testDemo();
        Assert.assertEquals("abc", "我是返回结果");
    }
}
