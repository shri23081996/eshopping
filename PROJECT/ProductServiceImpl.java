package com.emusic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emusic.dao.ProductDAO;
import com.emusic.model.Product;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDAO productDAO;
	public ProductServiceImpl(){
		
	}

	@Override
	public void addProduct(Product product) {
	productDAO.addProduct(product);

	}

	@Override
	public void updateProduct(Product product) {
		productDAO.updateProduct(product);
	

	}

	@Override
	public List<Product> listProduct() {
	return productDAO.listProduct();
	}

	@Override
	public Product getbyid(int id) {
	return productDAO.getbyid(id);
	}

	@Override
	public void deleteProduct(int id) {
	productDAO.deleteProduct(id);

	}

}
