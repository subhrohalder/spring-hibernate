package com.techgenizer.hibernate.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.techgenizer.hibernate.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

	
	public List <Product> findByName(String name);
	
	public List <Product> findByNameAndDescp(String name,String desc);
	
	public List <Product> findByPriceGreaterThan(int price);
	
	public List<Product> findByDescpContains(String desc);
	
	
	public List<Product> findByPriceBetween(int p1,int p2);
	
	
	public List<Product> findByDescpLike(String des);
	
	
	public List<Product> findByIdIn(List<Object> list);
	
	
	
	
	
	

}
