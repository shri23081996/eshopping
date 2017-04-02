package com.emusic.dao;

import java.util.List;

import com.emusic.model.Product;

public interface ProductDAO {
	public void addProduct(Product product);
	public void updateProduct(Product product);
	public List<Product> listProduct();
	public void deleteProduct(int id);
	public Product getbyid(int id);
}

