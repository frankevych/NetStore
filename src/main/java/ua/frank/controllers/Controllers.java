package ua.frank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.frank.service.UserService;

@Controller
public class Controllers {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/")
	public String welcome() {
		return "base";
	}
	
	//method яким чином ми приймаєм дані що передаються
	
	@RequestMapping(value="addUser",method=RequestMethod.POST)
	public String addUser(@RequestParam String firstName, @RequestParam String secondName, @RequestParam String email, @RequestParam String phoneNumber){//from body.jsp тег форм має два name які прирівнюються до цих аргументів
		userService.insert(firstName, secondName, email, phoneNumber);
		return "base";
		
	}
/*	
	@RequestMapping(value = "/registration")
	public String registration() {
		return "registration";
	}
	
	@RequestMapping(value = "/products")
	public String products() {
		return "products";
	}
	*/
}