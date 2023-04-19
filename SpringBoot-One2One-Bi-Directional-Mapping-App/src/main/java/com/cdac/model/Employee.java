package com.cdac.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee_table5")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String lastname;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	private Department department;

	public Employee() {
	
	}
	
	public Employee(int id) {
		super();
		this.id = id;
	
	}
	public Employee(String firstname, String lastname, Department department) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
	}
	public Employee(int id, String firstname, String lastname, Department department) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return  id + "  " + firstname + "  " + lastname + " "	+ department;
	}
	
	

}
