package com.techgenizer.hibernate;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.assertj.core.util.Arrays;
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

	@Test
	public void testFindByName() {
		List<Product> productList = productRepository.findByName("Samsung");

//		for(Product p:productList) {
//			System.out.println(p);
//		}
//		

		productList.forEach(p -> System.out.println(p));

		assertEquals(2, productList.size());

	}

	@Test
	public void testFindByNameAndDescp() {
		List<Product> productList = productRepository.findByNameAndDescp("Samsung", "Washer");

		productList.forEach(p -> System.out.println(p));
		assertEquals(1, productList.size());

	}

	@Test
	public void testFindByPriceGreaterThan() {
		List<Product> productList = productRepository.findByPriceGreaterThan(1000);
		productList.forEach(p -> System.out.println(p));

	}

	@Test
	public void testFindByDescContains() {
		List<Product> productList = productRepository.findByDescpContains("Wa");
		productList.forEach(p -> System.out.println(p));

	}

	@Test
	public void testFindByPriceBetween() {
		List<Product> productList = productRepository.findByPriceBetween(1200, 5000);
		productList.forEach(p -> System.out.println(p));
	}

	@Test
	public void testFindByDescLike() {

		List<Product> productList = productRepository.findByDescpLike("Wa%");

		productList.forEach(p -> System.out.println(p));
	}
	
	
	
	@Test
	public void testFindByIdIn() {
	      Integer a[] = new Integer[] { 1, 2, 3 };
		List<Product> productList = productRepository.findByIdIn(Arrays.asList(a));
		productList.forEach(p -> System.out.println(p));

	}

}
