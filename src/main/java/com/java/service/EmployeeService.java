package com.java.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.java.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	public void saveEmployee(Employee employee);
	public Employee getEmployeeById(long id);
	public void deleteEmployeeById(long id);
	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
