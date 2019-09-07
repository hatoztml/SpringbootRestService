package com.proje.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proje.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	Employee findByname(String name);

}
