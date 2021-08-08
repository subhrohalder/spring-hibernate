package com.techgenizer.hibernate.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.techgenizer.hibernate.model.Product;


public interface ProductSortRepository extends PagingAndSortingRepository<Product, Integer>{

	
	public List <Product> findByIdIn(List<Integer> list, Pageable pageable);
	

}
