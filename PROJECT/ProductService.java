package com.emusic.service;
import java.util.List;

import com.emusic.model.Product;

public interface ProductService {
	public void addProduct(Product product);
	public void updateProduct(Product product);
	public List<Product> listProduct();
	public void deleteProduct(int id);
	public Product getbyid(int id);
}
