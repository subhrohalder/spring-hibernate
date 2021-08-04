package com.techgenizer.hibernate.repository;

import org.springframework.data.repository.CrudRepository;

import com.techgenizer.hibernate.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
