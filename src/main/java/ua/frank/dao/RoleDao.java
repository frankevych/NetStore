package ua.frank.dao;

import java.util.List;

import ua.frank.entity.Role;

public interface RoleDao {
	
	public void insert(Role role);
	public void remove(Role role);
	public Role findById(int id);
	public List<Role> getAllRoles();
	public void update(Role role);
	
}