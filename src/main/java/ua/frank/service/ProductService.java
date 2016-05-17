package ua.frank.service;

import java.util.List;

import ua.frank.entity.Product;

public interface ProductService {

	public void insert(String productName, double price);
	public List<Product> getAllProducts();
	public void update(int id, String productName, double price);
	public void remove(int id);
}