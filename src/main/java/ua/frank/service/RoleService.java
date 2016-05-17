package ua.frank.service;

import java.util.List;

import ua.frank.entity.Role;

public interface RoleService {

	public void insert(String roleName);
	public List<Role> getAllRoles();
	public void update(int id, String roleName);
	public void remove(int id);
}