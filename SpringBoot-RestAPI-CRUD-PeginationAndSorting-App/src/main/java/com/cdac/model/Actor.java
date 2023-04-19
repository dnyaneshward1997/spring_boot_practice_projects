package com.cdac.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actor_table")
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String gender;
	private String industry;

	public Actor() {

	}

	public Actor(Long id) {
		super();
		this.id = id;

	}

	public Actor(String name, String gender, String industry) {
		super();
		this.name = name;
		this.gender = gender;
		this.industry = industry;
	}

	public Actor(Long id, String name, String gender, String industry) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.industry = industry;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	@Override
	public String toString() {
		return id + "  " + name + "  " + gender + "  " + industry;
	}

}
