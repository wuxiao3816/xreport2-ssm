package com.xreport2_demo;

import org.springframework.lang.Nullable;

public interface InterfaceTest {
//	@Nullable
	default Object test(Object bean) {
		System.out.println("");
		return bean;
	}
	
}
