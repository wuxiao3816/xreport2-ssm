package com.xreport2_demo;

import java.util.HashMap;
import java.util.Map;

public class CastException {
	public static Map m1 =  new HashMap();
	public static Map m = new HashMap() {{
		m1.put("a","2");
	}};
	public static void main(String[] args) {
		System.out.println(m1.get("a"));
	}
}
