package com.techgenizer.hibernate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.techgenizer.hibernate.model.Employee;
import com.techgenizer.hibernate.repository.EmployeeRepository;

@SpringBootTest
  class EmployeeTests {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Test
	public void insertEmployee() {
		Employee employee = new Employee();
//		employee.setId(1544l);
		employee.setName("Raj Y");
		 
		employeeRepository.save(employee);
	}
	
	
	

}
