package com.vishnu.EmployeeAddress.service;

import com.vishnu.EmployeeAddress.model.Employee;
import com.vishnu.EmployeeAddress.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
	@Autowired
	EmployeeRepo empRepo;

	public List<Employee> getEmployees() {
		return empRepo.findAll();
	}

	public Employee getEmployeeById(Long id) {
		return empRepo.findById(id).orElse(null);
	}

	public String addEmp(Employee emp) {
		empRepo.save(emp);
		return "new employee added";
	}

	public String updateById(Long id, Employee emp) {
		Employee found = empRepo.findById(id).orElse(null);
		if (found!=null){
			found.setFirstName(emp.getFirstName());
			found.setLastName(emp.getLastName());
			found.setAddress(emp.getAddress());
			empRepo.save(found);
			return "updated employee";
		}else {
			return "Invalid Id";
		}
	}

	public String deleteById(Long id) {
		empRepo.deleteById(id);
		return "employee deleted";
	}
}
