package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class SpringSecurityTeusko1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityTeusko1Application.class, args);
	}
	
	
	@RequestMapping("/login")
	public String login() {
		return "login.jsp";
	}

	@RequestMapping("/user")
	public String userDashboard() {
		return "user.jsp";
	}

	@RequestMapping("/admin")
	public String adminDashboard() {
		return "admin.jsp";
	}

}
