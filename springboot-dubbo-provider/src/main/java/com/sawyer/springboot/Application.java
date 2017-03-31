package com.sawyer.springboot;

import java.util.concurrent.CountDownLatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.sawyer.springboot.DubboProperties;

/**
 * 
 * @ClassName: Application
 * @Description:
 * @author zhanglingyun
 * @date 2017年3月31日
 */
@SpringBootApplication
@EnableScheduling
public class Application {

	public static void main(String[] args) throws InterruptedException {

		ApplicationContext ctx = new SpringApplicationBuilder()
				.sources(Application.class).web(false).run(args);
		// 阻塞主线程
		// 关闭进程时 需kill掉进程 ，不能用kill -9 ，原因参考dubbo关闭
		CountDownLatch closeLatch = ctx.getBean(CountDownLatch.class);
		closeLatch.await();

		ApplicationContext context = SpringApplication.run(Application.class,
				args);
		DubboProperties dubboProperties = context
				.getBean(DubboProperties.class);
		System.out.println(dubboProperties.getScan());
	}

	@Bean
	public CountDownLatch closeLatch() {
		return new CountDownLatch(1);
	}
}
