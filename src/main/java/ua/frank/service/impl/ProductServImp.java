package ua.frank.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.frank.dao.impl.ProductDAOImp;
import ua.frank.entity.Product;
import ua.frank.service.ProductService;

@Service
public class ProductServImp implements ProductService{
	
	@Autowired
	private ProductDAOImp productDAOImp;
	
	@Transactional
	public void insert(String productName, double price) {
		productDAOImp.insert(new Product(productName, price));
	}

	public List<Product> getAllProducts() {
		return productDAOImp.getAllProducts();
	}

	@Transactional
	public void update(int id, String productName, double price) {
		Product product = productDAOImp.findById(id);
		product.setProductName(productName);
		product.setPrice(price);
		productDAOImp.update(product);
	}

	@Transactional
	public void remove(int id) {
		Product product = productDAOImp.findById(id);
		productDAOImp.remove(product);
	}

}