package com.letsstartcoding.springbootrestexample.repository;

import com.letsstartcoding.springbootrestexample.model.Employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	

}
