package com.example.producerservice.Dao;

import com.example.producerservice.Model.Employee;

public class EmployeeDao {
	
	public Employee getDetails() {
		return new Employee(1,"Vipul",25000);
	}

}
