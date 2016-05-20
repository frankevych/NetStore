package ua.frank.service;

import java.util.List;

import ua.frank.entity.User;

public interface UserService {

	public void insert(String firstName, String secondName, String email, String phoneNumber);
	public void insert(User user);
	public List<User> getAllUsers();
	public void update(int id, String firstName, String secondName, String email, String phoneNumber);
	public void remove(int id);
}