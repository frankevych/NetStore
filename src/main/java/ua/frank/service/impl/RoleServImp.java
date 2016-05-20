package ua.frank.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.frank.dao.impl.RoleDAOImp;
import ua.frank.entity.Role;
import ua.frank.service.RoleService;

@Service
public class RoleServImp implements RoleService{

	@Autowired
	private RoleDAOImp roleDAOImp;

	@Transactional
	public void insert(String roleName) {
		roleDAOImp.insert(new Role(roleName));
	}

	public Role findById(int id) {
		return roleDAOImp.findById(id);
	}
	
	public List<Role> getAllRoles() {
		return roleDAOImp.getAllRoles();
	}

	@Transactional
	public void update(int id, String roleName) {
		Role role = roleDAOImp.findById(id);
		role.setRoleName(roleName);
		roleDAOImp.update(role);
	}

	@Transactional
	public void remove(int id) {
		Role role = roleDAOImp.findById(id);
		roleDAOImp.remove(role);
	}
}