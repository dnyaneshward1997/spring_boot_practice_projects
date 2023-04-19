package com.cdac.service;

import java.util.List;
import com.cdac.model.Product;

public interface ProductService {
	
	public void add(Product product);

	public void modify(Product product);

	public void removeById(int id);

	public Product getById(int id);

	public List<Product> getAll();

//	public List<Product> getAllByName(String name);
//
//	public List<Product> getBySalary(float salary);

	
	
}
