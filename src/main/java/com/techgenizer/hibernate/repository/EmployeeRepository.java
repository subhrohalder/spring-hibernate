package com.techgenizer.hibernate.repository;

import org.springframework.data.repository.CrudRepository;

import com.techgenizer.hibernate.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
