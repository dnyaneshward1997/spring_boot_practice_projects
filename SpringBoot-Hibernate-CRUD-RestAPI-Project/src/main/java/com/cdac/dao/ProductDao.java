package com.cdac.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cdac.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

// 	List<Product> findByName(String name);

//    List<Product> selectBySalary(float price);

}
