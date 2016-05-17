package ua.frank.dao;

import java.util.List;

import ua.frank.entity.Product;

public interface ProductDao {
	public void insert(Product product);
	public void remove(Product product);
	public Product findById(int id);
	public List<Product> getAllProducts();
	public void update(Product product);
}