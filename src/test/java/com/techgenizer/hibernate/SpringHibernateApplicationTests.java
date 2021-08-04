package com.techgenizer.hibernate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.techgenizer.hibernate.model.Product;
import com.techgenizer.hibernate.repository.ProductRepository;

@SpringBootTest
class SpringHibernateApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	EntityManager entityManager;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate() {
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone-X");
		product.setDesc("Great to have");
		product.setPrice(10000);

		productRepository.save(product);

	}

	@Test
	public void testRead() {

		Product product = productRepository.findById(1).get();
		System.out.println(product);
		assertEquals("Iphone-X", product.getName());

	}
	
	
	@Test
	public void testUpdate() {
		Product product = productRepository.findById(1).get();
		product.setPrice(2000);
		productRepository.save(product);
		assertEquals(2000, productRepository.findById(1).get().getPrice());
	}
	
	
	@Test
	public void testDelete() {
		productRepository.deleteById(1);
	}
	
	
	@Test
	public void testCount() {
		
		assertEquals(1, productRepository.count());
		
	}
	
		

}
