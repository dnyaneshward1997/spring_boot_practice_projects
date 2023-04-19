package com.cdac.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.cdac.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{

}
