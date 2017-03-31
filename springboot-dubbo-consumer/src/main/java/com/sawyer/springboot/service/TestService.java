package com.sawyer.springboot.service;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sawyer.springboot.api.HelloService;

@Service
public class TestService {

	@Reference(version = "1.0.0")
	public HelloService helloService;

	public String sayHello(String name) {
		return helloService.sayHello(name);
	}
}
