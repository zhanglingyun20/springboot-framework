package com.sawyer.springboot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.sawyer.springboot.api.HelloService;
/**
 * 
 * @ClassName: HelloServiceImpl  
 * @Description:
 * @author zhanglingyun  
 * @date 2017年3月31日
 */
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "hello:" + name;
	}
}
