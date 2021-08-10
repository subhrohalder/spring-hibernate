package com.techgenizer.hibernate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.techgenizer.hibernate.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

	
	public List <Product> findByName(String name);
	
	public List <Product> findByNameAndDescp(String name,String desc);
	
	public List <Product> findByPriceGreaterThan(int price);
	
	public List<Product> findByDescpContains(String desc);
	
	
	public List<Product> findByPriceBetween(int p1,int p2);
	
	
	public List<Product> findByDescpLike(String des);
	
	
	public List<Product> findByIdIn(List<Object> list);
	
	@Query("Select p.name from Product p")
	public List<String> getAllByJpql ();
	
	
	@Query("Select product from Product product where name=:name")
	public List<Product> getByParticularName(@Param("name")String name);
	
	
	
	@Query("Delete from Product product where name=:name")
	@Modifying
	public void deleteByParticularName(@Param("name")String name);
	
	
	@Query(value = "Select * from Product" ,nativeQuery=true)
	public List<Product> getAllByNative ();
	
	
	@Query(value="Select * from Product  where name=:name",nativeQuery=true)
	public List<Product> getByParticularNameNative(@Param("name")String name);
	
	
	
	
	
	

}
