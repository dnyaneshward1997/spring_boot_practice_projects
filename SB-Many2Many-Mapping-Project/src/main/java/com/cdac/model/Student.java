package com.cdac.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student_table")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_Id;
	private String student_FirstName;
	private String student_LastName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student_subject", joinColumns = {@JoinColumn(name="student_Id")},
	inverseJoinColumns = {@JoinColumn(name="subject_Id")})
	private Set<Subject> subjects = new HashSet<>();

	
	public Student() {

	}

	public Student(int student_Id) {

		this.student_Id = student_Id;
	}

	public Student(int student_Id, String student_FirstName, String student_LastName) {

		this.student_Id = student_Id;
		this.student_FirstName = student_FirstName;
		this.student_LastName = student_LastName;
	}

	public int getStudent_Id() {
		return student_Id;
	}

	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}

	public String getStudent_FirstName() {
		return student_FirstName;
	}

	public void setStudent_FirstName(String student_FirstName) {
		this.student_FirstName = student_FirstName;
	}

	public String getStudent_LastName() {
		return student_LastName;
	}

	public void setStudent_LastName(String student_LastName) {
		this.student_LastName = student_LastName;
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return student_Id + "  " + student_FirstName + "  " + student_LastName + "   " + subjects;
	}

}
