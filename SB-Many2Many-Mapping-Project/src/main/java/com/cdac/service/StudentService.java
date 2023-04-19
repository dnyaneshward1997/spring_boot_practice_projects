package com.cdac.service;

import java.util.List;

import com.cdac.model.Student;

public interface StudentService {
	
	void add_Student(Student student);
	
	void update_Student(Student student);
	
	void delete_Student_By_Id(int id);
	
	Student get_Student_By_Id(int id);
	
	List<Student> get_All_Student();

}
