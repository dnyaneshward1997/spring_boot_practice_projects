package com.cdac.service;

import java.util.List;
import com.cdac.model.Employee;

public interface EmployeeService {

	void save(Employee employee);

	void modify(Employee employee);

	void deleteById(int id);

	Employee selectById(int id);

	List<Employee> selectAllEmployee();

	List<Employee> getAlPaginated(int pageNo, int sizeSize);

	List<Employee> getAlPaginatedAndSorted(int pageNo, int sizeSize, String field);

}