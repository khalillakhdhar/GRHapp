package com.sec.controllers.routes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sec.controllers.services.EmployeeService;
import com.sec.model.Employee;

@Controller
public class EmployeeRoutes {
@Autowired
EmployeeService api;
@GetMapping("employee")
public List<Employee> getAll()
{
return api.getEmployee();	
}
@PostMapping("employee")
public Employee create(@RequestBody Employee employee)
{
return api.createUser(employee);	
}

}
