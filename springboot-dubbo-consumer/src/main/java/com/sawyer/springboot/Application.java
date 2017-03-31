package com.sawyer.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sawyer.springboot.service.TestService;

/**
 * 
 * @ClassName: Application  
 * @Description:
 * @author zhanglingyun  
 * @date 2017年3月31日
 */
@SpringBootApplication
public class Application 
{
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        TestService test = run.getBean(TestService.class);
        System.out.println(test.sayHello("sawyer"));
    }
}
