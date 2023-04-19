package com.cdac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.model.Student;
import com.cdac.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping(value = { "/student" })
	public String add_Student(@RequestBody Student student) {
		studentService.add_Student(student);
		return "Student added successfully";
	}

	@PutMapping(value = { "/student" })
	public String update_Student(@RequestBody Student student) {
		studentService.update_Student(student);
		return "Student updated successfully";
	}

	@DeleteMapping(value = { "/student" })
	public String delete_Student(@RequestParam int id) {
		System.out.println("first delete");
		studentService.delete_Student_By_Id(id);
		return "Student deleted successfully";
	}

	@DeleteMapping(value = { "/student/{id}" })
	public String delete_Student1(@PathVariable int id) {
		System.out.println("second delete");
		studentService.delete_Student_By_Id(id);
		return "Student deleted successfully";
	}

	@GetMapping(value = { "/student/{id}" })
	public Student get_Student_By_Id(@PathVariable int id) {
		return studentService.get_Student_By_Id(id);
	}

	@GetMapping(value = { "/student" })
	public List<Student> get_All_Student() {
		return studentService.get_All_Student();
	}

}
