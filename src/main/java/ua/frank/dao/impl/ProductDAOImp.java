package ua.frank.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;

import ua.frank.dao.ProductDao;
import ua.frank.entity.Product;

@Repository
public class ProductDAOImp implements ProductDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Product product) {
		entityManager.persist(product);
	}
	
	public void remove(Product product) {
		entityManager.remove(product);
	}
	
	public Product findById(int id) {
		return entityManager.find(Product.class, id);
	}
	
	public List<Product> getAllProducts() {
		return entityManager.createQuery("from Product", Product.class).getResultList();
	}
	
	public void update(Product product) {
		entityManager.merge(product);
	}
}