package com.skills.academy.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.skills.academy.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	Optional<Employee> findById(Long id);

	List<Employee> findByDepartment(String department);
	
	List<Employee> findAll();
	
	Employee save(Employee employee);
}
