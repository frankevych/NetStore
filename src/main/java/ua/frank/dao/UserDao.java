package ua.frank.dao;

import java.util.List;

import ua.frank.entity.User;

public interface UserDao {
	
	public void insert(User user);
	public User findUser(int id);
	public List<User> getAllUsers();
	public void update(User user);
	public void remove(User user);
}