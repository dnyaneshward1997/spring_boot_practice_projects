package com.cdac.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.StudentDao;
import com.cdac.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public void add_Student(Student movie) {
		studentDao.save(movie);

	}

	@Override
	public void update_Student(Student movie) {
		studentDao.save(movie);

	}

	@Override
	public void delete_Student_By_Id(int id) {
		studentDao.deleteById(id);

	}

	@Override
	public Student get_Student_By_Id(int id) {
		Optional<Student> opt = studentDao.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Student> get_All_Student() {
		Iterable<Student> itr = studentDao.findAll();
		List<Student> lst = new ArrayList<Student>();
		itr.forEach(ele -> lst.add(ele));
		return lst;
	}

}
