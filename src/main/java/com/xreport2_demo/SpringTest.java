package com.xreport2_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.matrix.ssm.pojo.TestUser;

public class SpringTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/xreport2_demo/spring-mybatis.xml");
//		ClassPathResource
		//2. 从 IOC 容器中获取 bean 的实例
		TestUser helloWorld1 = (TestUser) ctx.getBean("testUser"); 
		System.out.println(helloWorld1.getUserName());
		TestBean hello1 = (TestBean) ctx.getBean("testBean"); 
		System.out.println(hello1.getTestString());
//		TestUser hello2 = (TestUser) ctx.getBean("test2"); 
//		System.out.println(hello2.getUserName());
//		changeRef(helloWorld1);
		TestUser helloWorld2 = (TestUser) ctx.getBean("testUser"); 
		helloWorld2.setUserName("chendazhuang");
		System.out.println(helloWorld2.getUserName());
		System.out.println(helloWorld2.getUserName());
//		Resource r = new 
		
//		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory();
		
//		StringUtils.tokenizeToStringArray(location, CONFIG_LOCATION_DELIMITERS);
	}
	
	public static void changeRef(TestUser helloWorld) {
		TestUser helloWorld1 = helloWorld;
		System.out.print("********************");
		System.out.print((helloWorld1==helloWorld));
	}
	
	
}
