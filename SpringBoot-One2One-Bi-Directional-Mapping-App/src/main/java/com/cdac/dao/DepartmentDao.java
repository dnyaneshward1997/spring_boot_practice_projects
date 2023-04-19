package com.cdac.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cdac.model.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Integer> {

}