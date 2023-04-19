package com.cdac.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.cdac.dao.EmployeeDao;
import com.cdac.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public void save(Employee employee) {
		employeeDao.save(employee);

	}

	@Override
	public void modify(Employee employee) {
		employeeDao.save(employee);

	}

	@Override
	public void deleteById(int id) {
		employeeDao.deleteById(id);

	}

	@Override
	public Employee selectById(int id) {

		Optional<Employee> opt = employeeDao.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}

		return null;
	}

	@Override
	public List<Employee> selectAllEmployee() {

		Iterable<Employee> itr = employeeDao.findAll();

		List<Employee> lst = new ArrayList<Employee>();
		itr.forEach(ele -> lst.add(ele));
		return lst;
	}

	@Override
	public List<Employee> getAlPaginated(int pageNo, int sizeSize) {

		Pageable p = PageRequest.of(pageNo, sizeSize);
		return employeeDao.findAll(p).toList();
	}

	@Override
	public List<Employee> getAlPaginatedAndSorted(int pageNo, int sizeSize, String field) {

		Pageable p = PageRequest.of(pageNo, sizeSize, Direction.ASC, field);
		return employeeDao.findAll(p).toList();
	}

}