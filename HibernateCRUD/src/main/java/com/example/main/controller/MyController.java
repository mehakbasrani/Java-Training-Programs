package com.example.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.main.entities.User;
import com.example.main.services.UserService;

@Controller
public class MyController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/regpage")
	public String openRegPage(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/submitform")
	public String submitform(@ModelAttribute("user") User user, Model model) {
		boolean status = userService.registerUser(user);
		
		if(status) {
			model.addAttribute("successMsg", "Registered Successful!");
		}
		else {
			model.addAttribute("errorMsg", "Error!! user not registered!");
		}
		return "register";

	}
	
	@GetMapping("/loginpage")
	public String openLoginPage(Model model) {
//		model.addAttribute("user", new User());
		return "login";
	}
}
