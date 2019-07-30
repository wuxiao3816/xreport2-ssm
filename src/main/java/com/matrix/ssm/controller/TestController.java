package com.matrix.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.matrix.ssm.pojo.TestUser;
import com.matrix.ssm.service.UserService;

@Controller
public class TestController {

	@Autowired
	private UserService userService;
	
    @RequestMapping("/test")
	@ResponseBody
    public String handleRequest(){
        System.out.println("---------TestController executed--------");
        TestUser testUser = userService.getUserById(1);
        System.out.println(testUser.getUserName());
        
        return testUser.getUserName();
    }
    @RequestMapping("/test1")
   	@ResponseBody
       public String handleRequest1(){
           System.out.println("---------TestController executed1--------");
           List<TestUser> list = userService.getUserAll();
           
           for(TestUser testUser:list) {
        	   System.out.println(testUser.getUserName());
           }
           return "123";
       }
}
