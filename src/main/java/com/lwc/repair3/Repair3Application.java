package com.lwc.repair3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.lwc.repair3.dao"})
public class Repair3Application {

	public static void main(String[] args) {
		SpringApplication.run(Repair3Application.class, args);
	}
}
