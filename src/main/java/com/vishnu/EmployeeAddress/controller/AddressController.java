package com.vishnu.EmployeeAddress.controller;

import com.vishnu.EmployeeAddress.model.Address;
import com.vishnu.EmployeeAddress.model.Employee;
import com.vishnu.EmployeeAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
	@Autowired
	AddressService addService;

	@GetMapping("addresses")
	public List<Address> getAddress(){
		return addService.getAddress();
	}
	@GetMapping("addresses/{id}")
	public Address getAddressById(@PathVariable Long id){
		return addService.getAddressById(id);
	}

	@PostMapping("addresses")
	public String addAddress(@RequestBody Address add){
		return addService.addAddress(add);
	}

	@PutMapping("addresses/{id}")
	public String updateAddressById(@PathVariable Long id,@RequestBody Address add){
		return addService.updateAddressById(id,add);
	}

	@DeleteMapping("addresses/{id}")
	public String deleteAddressById(@PathVariable Long id){
		return addService.deleteAddressById(id);
	}
}
