package com.cdac.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.cdac.dao.DepartmentDao;
import com.cdac.dao.EmployeeDao;
import com.cdac.model.Department;
import com.cdac.model.Employee;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public void save(Department department) {
		departmentDao.save(department);

	}

	@Override
	public void modify(Department department) {
		departmentDao.save(department);

	}

	@Override
	public void deleteById(int id) {
		departmentDao.deleteById(id);

	}

	@Override
	public Department selectById(int id) {

		Optional<Department> opt = departmentDao.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}

		return null;
	}

	@Override
	public List<Department> selectAll() {

		Iterable<Department> itr = departmentDao.findAll();

		List<Department> lst = new ArrayList<Department>();
		itr.forEach(ele -> lst.add(ele));
		return lst;
	}

	@Override
	public List<Department> getAlPaginated(int pageNo, int sizeSize) {

		Pageable p = PageRequest.of(pageNo, sizeSize);
		return departmentDao.findAll(p).toList();
	}

	@Override
	public List<Department> getAlPaginatedAndSorted(int pageNo, int sizeSize, String field) {

		Pageable p = PageRequest.of(pageNo, sizeSize, Direction.ASC, field);
		return departmentDao.findAll(p).toList();
	}

}