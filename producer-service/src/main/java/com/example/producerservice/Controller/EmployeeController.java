package com.example.producerservice.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.producerservice.Dao.EmployeeDao;
import com.example.producerservice.Model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping("/employee")
	public Employee getEmployee() {
		EmployeeDao employee = new EmployeeDao();
		return employee.getDetails();
	}

}
