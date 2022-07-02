package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.repository.LogRepository;
import com.example.demo.service.IDemoService;
import com.example.demo.service.impl.DemoServiceImpl;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	public LogRepository logRepository;

	@Bean
	public IDemoService demoService() {
		return new DemoServiceImpl(this.logRepository);
	}
}
