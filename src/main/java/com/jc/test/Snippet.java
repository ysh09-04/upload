package com.jc.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.jc.springboot.HelloController;
@ComponentScan("com.jc.springboot")
@EnableAutoConfiguration
public class Snippet {
	public static void main(String[] args) {
	    //主函数运行springboot项目
	    SpringApplication.run(HelloController.class,args);
	}
}

