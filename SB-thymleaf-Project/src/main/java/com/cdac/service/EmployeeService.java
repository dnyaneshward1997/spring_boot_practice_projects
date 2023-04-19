package com.cdac.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.cdac.model.Employee;


@Service
public interface EmployeeService {
	List<Employee> getAllEmployees();

	void saveEmployee(Employee employee);

	Employee getEmployeeById(long id);

	void deleteEmployeeById(long id);

	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
