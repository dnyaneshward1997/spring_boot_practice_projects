package com.cdac.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "subject_table")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subject_Id;
	private String subject_name;
	private String subject_department;

	@ManyToMany(mappedBy = "subjects")
	@JsonBackReference
	private Set<Student> students = new HashSet<>();

	public Subject() {

	}

	public Subject(int subject_Id) {

		this.subject_Id = subject_Id;
	}

	public Subject(int subject_Id, String subject_name, String subject_department) {
		super();
		this.subject_Id = subject_Id;
		this.subject_name = subject_name;
		this.subject_department = subject_department;
	}

	public int getSubject_Id() {
		return subject_Id;
	}

	public void setSubject_Id(int subject_Id) {
		this.subject_Id = subject_Id;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public String getSubject_department() {
		return subject_department;
	}

	public void setSubject_department(String subject_department) {
		this.subject_department = subject_department;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return subject_Id + "  " + subject_name + "  " + subject_department + "   " + students;
	}

}
