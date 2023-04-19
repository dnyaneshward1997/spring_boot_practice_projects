package com.cdac.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.cdac.model.Subject;


@Repository
public interface SubjectDao extends JpaRepository<Subject, Integer>{

}
