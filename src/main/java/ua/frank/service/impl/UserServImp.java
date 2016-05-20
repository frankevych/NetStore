package ua.frank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.frank.dao.impl.UserDAOImp;
import ua.frank.entity.User;
import ua.frank.service.UserService;

@Service
public class UserServImp implements UserService{

	@Autowired
	private UserDAOImp userDAOImp;

	@Transactional
	public void insert(String firstName, String secondName, String email, String phoneNumber) {
		User user = new User(firstName, secondName, email, phoneNumber);
		userDAOImp.insert(user);
	}
	

	@Transactional
	public void insert(User user) {
		userDAOImp.insert(user);
	}

	public List<User> getAllUsers() {
		return userDAOImp.getAllUsers();
	}

	@Transactional
	public void update(int id, String firstName, String secondName, String email, String phoneNumber) {
		User user = userDAOImp.findUser(id);
		user.setFirstName(firstName);
		user.setSecondName(secondName);
		user.setEmail(email);
		user.setPhoneNumber(phoneNumber);
		userDAOImp.update(user);
	}

	@Transactional
	public void remove(int id) {
		User user = userDAOImp.findUser(id);
		userDAOImp.remove(user);
	}
}