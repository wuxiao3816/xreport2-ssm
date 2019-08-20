package com.xreport2_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.matrix.ssm.pojo.TestUser;

public class SpringTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/xreport2_demo/spring-mybatis.xml");

		//2. 从 IOC 容器中获取 bean 的实例
		TestUser helloWorld = (TestUser) ctx.getBean("testUser"); 
	
		System.out.println(helloWorld.getUserName());
	}
}
