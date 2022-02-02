package com.sec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sec.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
