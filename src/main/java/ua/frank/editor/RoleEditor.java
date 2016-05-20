package ua.frank.editor;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.frank.entity.Role;
import ua.frank.service.RoleService;

@Component
public class RoleEditor extends PropertyEditorSupport{

	@Autowired
	private RoleService roleService;
	
	@Override
	public void setAsText(String text){
		Role role = roleService.findById(Integer.valueOf(text));
		setValue(role);
	}
}