package com.chapelin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chapelin.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@RequestMapping("login")
	public String login(HttpServletRequest request, HttpServletResponse response) {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(userService.checkLogin(username, password)){
			request.setAttribute("message", "SUCCESS!");
		}else{
			request.setAttribute("message", "FAILURE!");
		}
		return "login";
	}
}
