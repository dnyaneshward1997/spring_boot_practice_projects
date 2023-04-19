package com.cdac.service;

import java.util.List;

import com.cdac.model.Department;

public interface DepartmentService {

	void save(Department department);

	void modify(Department department);

	void deleteById(int id);

	Department selectById(int id);

	List<Department> selectAll();

	List<Department> getAlPaginated(int pageNo, int sizeSize);

	List<Department> getAlPaginatedAndSorted(int pageNo, int sizeSize, String field);

}