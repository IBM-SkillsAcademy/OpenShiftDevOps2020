package com.skills.academy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skills.academy.entity.Employee;
import com.skills.academy.repository.EmployeeRepository;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	@Value("${filterorg:}")
	private String key;

	@GetMapping("/")
	public List<Employee> getEmployee() {
		System.out.println("------------key-------------"+key);
		return repository.findAll();
	}

	@PostMapping(path = "/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return repository.save(employee);
	}

	/*
	 * @PutMapping(path = "/update", produces = "application/json") public Instance
	 * updateInstance(@RequestBody Instance customer) { return
	 * repository.save(customer); }
	 */
}
