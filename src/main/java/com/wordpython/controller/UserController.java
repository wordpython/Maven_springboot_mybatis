package com.wordpython.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.wordpython.po.User;
import com.wordpython.service.UserService;

@Controller
//@EnableAutoConfiguration
public class UserController {
	@Autowired
	UserService userService ;
	
	@RequestMapping("/user")
	@ResponseBody
	public String findUser() {
		User user=userService.findByUsername("姚群弟");
		System.out.println(user);
		return "welcome to springboot试试有没有乱码!/n"+user;
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public String save() {
		User user=new User("111111111", "aaaaaa", "111111", "11111111111");
		int total=userService.save(user);
		return "welcome to springboot试试有没有乱码!/t"+total;
	}
}
