package ua.frank.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ua.frank.dao.UserDao;
import ua.frank.entity.User;

@Repository
public class UserDAOImp implements UserDao{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * insertUser will insert user into database
	 * @param user
	 * */
	public void insert(User user) {
		entityManager.persist(user);
	}
	
	public User findUser(int id) {
		return entityManager.find(User.class, id);
	}
	
	/**
	 * get all users from database
	 * @return List of users from database
	 * */
	public List<User> getAllUsers() {
		return entityManager.createQuery("from User", User.class).getResultList();
	}
	
	public void update(User user) {
		entityManager.merge(user);
	}
	
	public void remove(User user) {
		entityManager.remove(user);
	}
}