package com.vishnu.EmployeeAddress.service;

import com.vishnu.EmployeeAddress.model.Address;
import com.vishnu.EmployeeAddress.model.Employee;
import com.vishnu.EmployeeAddress.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
	@Autowired
	AddressRepo addRepo;

	public List<Address> getAddress() {
		return addRepo.findAll();
	}

	public Address getAddressById(Long id) {
		return addRepo.findById(id).orElse(null);
	}

	public String addAddress(Address add) {
		addRepo.save(add);
		return "Added new Address";
	}

	public String updateAddressById(Long id, Address add) {
		Address found = addRepo.findById(id).orElse(null);
		if (found!=null){
			found.setStreet(add.getStreet());
			found.setCity(add.getCity());
			found.setZipcode(add.getZipcode());
			found.setState(add.getState());
			addRepo.save(found);
			return "updated Address";
		}else{
			return "Invalid Id";
		}
	}

	public String deleteAddressById(Long id) {
		addRepo.deleteById(id);
		return "Address deleted successfully";
	}
}
