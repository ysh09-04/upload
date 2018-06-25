package com.jc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.jc")
@EnableAutoConfiguration
@SpringBootApplication
public class App {
	public static void main(String[] args) {
	    //主函数运行springboot项目
	    SpringApplication.run(App.class,args);
	}
}

