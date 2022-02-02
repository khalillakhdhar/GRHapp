package com.sec.controllers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.model.Employee;
import com.sec.repository.EmployeeRepository;

@Service
public class EmployeeService {
@Autowired
EmployeeRepository employeeRepository;
public Employee createUser(Employee employee)
{
	return employeeRepository.save(employee);

}
public List<com.sec.model.Employee> getEmployee()
{
return  employeeRepository.findAll();	
}

}
