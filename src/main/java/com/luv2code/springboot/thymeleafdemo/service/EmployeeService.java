package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeService {

	public Page<Employee> listAll(int pageNum);
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
	public List<Employee> searchBy(String firstName);
}
