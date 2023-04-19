package com.cdac.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.SubjectDao;
import com.cdac.model.Subject;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private SubjectDao subjectDao;

	@Override
	public void add_Subject(Subject subject) {
		subjectDao.save(subject);

	}

	@Override
	public void update_Subject(Subject subject) {
		subjectDao.save(subject);

	}

	@Override
	public void delete_Subject_By_Id(int id) {
		subjectDao.deleteById(id);

	}

	@Override
	public Subject get_Subject_By_Id(int id) {
		Optional<Subject> opt = subjectDao.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Subject> get_All_Subject() {
		Iterable<Subject> itr = subjectDao.findAll();
		List<Subject> lst = new ArrayList<Subject>();
		itr.forEach(ele -> lst.add(ele));
		return lst;
	}

}
