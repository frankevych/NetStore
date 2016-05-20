package ua.frank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.frank.editor.RoleEditor;
import ua.frank.entity.Role;
import ua.frank.entity.User;
import ua.frank.service.RoleService;
import ua.frank.service.UserService;

@Controller
public class Controllers {
	
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private RoleEditor roleEditor;

	@RequestMapping(value = "/")
	public String welcome(Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("roles", roleService.getAllRoles());
		return "base";
	}

	@RequestMapping(value="addUser", method=RequestMethod.POST)
	public String addUser(@ModelAttribute(value="newUser") User user){
		userService.insert(user);
		return "redirect:/";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder){
		webDataBinder.registerCustomEditor(Role.class, roleEditor);
	}

	@RequestMapping(value="addRole", method=RequestMethod.POST)
	public String addRole(@RequestParam String roleName){
		roleService.insert(roleName);
		return "redirect:/";
	}
}