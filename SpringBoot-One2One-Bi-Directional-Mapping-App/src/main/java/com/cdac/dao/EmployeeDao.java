package com.cdac.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cdac.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}