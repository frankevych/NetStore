package ua.frank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllers {

	@RequestMapping(value = "/")
	public String welcome() {
		return "index";
	}
	
	@RequestMapping(value = "/registration")
	public String registration() {
		return "registration";
	}
	
	@RequestMapping(value = "/products")
	public String products() {
		return "products";
	}
}