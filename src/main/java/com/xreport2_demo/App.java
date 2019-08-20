package com.xreport2_demo;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {	
    	String resource = "com/matrix/ssm/mybatis-config.xml";
	InputStream inputStream = Resources.getResourceAsStream(resource);
	SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	
    System.out.println(SqlSessionFactory.class.getClassLoader().getResource("").toString());
    	
    
    String classpath = "C:\\Users\\Administrator\\eclipse-workspace\\xreport2-demo\\target\\classes\\com\\xreport2_demo";
    
    	File  f = new File (classpath) ;
    	URL ur =f.toURI().toURL();
    	System.out.println(ur.toString());
    	
    	
    	
    	URL[] array = {ur};
    	URLClassLoader u = new URLClassLoader(array );
    	Class c = u.loadClass("com.xreport2_demo.ClassLoadTest");
    	System.out.println(u.findResource(classpath+"com.xreport2_demo.ClassLoadTest.class"));
    	
    	Object obj = c.newInstance();
    	Method method = c.getMethod("print");
    	method.invoke(obj,null);
    	System.out.println(c.getName());
    }
}
