package com.vishnu.EmployeeAddress.controller;

import com.vishnu.EmployeeAddress.model.Employee;
import com.vishnu.EmployeeAddress.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
	@Autowired
	EmpService empService;

	@GetMapping("employees")
	public List<Employee> getEmployee(){
		return empService.getEmployees();
	}
	@GetMapping("employees/{id}")
	public Employee getEmployeeById(@PathVariable Long id){
		return empService.getEmployeeById(id);
	}

	@PostMapping("employees")
	public String addEmployee(@RequestBody Employee emp){
		return empService.addEmp(emp);
	}

	@PutMapping("employees/{id}")
	public String updateById(@PathVariable Long id,@RequestBody Employee emp){
		return empService.updateById(id,emp);
	}

	@DeleteMapping("employees/{id}")
	public String deleteById(@PathVariable Long id){
		return empService.deleteById(id);
	}
}
