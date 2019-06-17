package com.example.consumerservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.consumerservice.Model.Employee;

@RestController
public class ConsumerClient {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/employee")
	public Employee getEmployee() {

		String baseUrl = "http://producer-service/employee";
		return restTemplate.getForObject(baseUrl, Employee.class);
	}
}
