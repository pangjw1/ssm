package com.crx.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

	   @RequestMapping("login")
	   public String login(String username){
		  if(username.equals("admin"))
			  return "redirect:/goods/findAll.action";
		  else
			  return "../login";
	   }
}
