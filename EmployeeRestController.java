package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entities.Employee;
import com.employee.repositories.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {



		@Autowired
		EmployeeRepository employeeRepo;
		
		
		@GetMapping
		public List<Employee> getEmployee() {
		return employeeRepo.findAll();
			
		}
		
		@PostMapping
		public Employee saveMovie(@RequestBody Employee employee) {
		return employeeRepo.save(employee);
			
		}
		
		@PutMapping
		public Employee updateMovie( Employee employee ) {
			return employeeRepo.save(employee);
		
		}
		
		@DeleteMapping("/{id}")
		public void deleteMovie(@PathVariable("id") Long id) {
			employeeRepo.deleteById(id);
					
		} 

}
