package com.xhfk.scatter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * 1. 全局配置系统对mapper接口扫描
 * 2. 也可以在每个mapper接口上加上@Mapper注解
 * */
@MapperScan({"com.xhfk.scatter.dao","com.xhfk.scatter.api.index.dao"})
public class ScatterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScatterApplication.class, args);
	}

}

