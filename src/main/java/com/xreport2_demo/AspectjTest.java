package com.xreport2_demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class AspectjTest {
	@Pointcut("execution(* com.xreport2_demo.TestBean.*(..))")
	public void test() {
		
	}
	@Before("test()")
	public void before() {
		System.out.println("before test()");
	}
	@After("test()")
	public void after() {
		System.out.println("before test()");
	}
	
}
