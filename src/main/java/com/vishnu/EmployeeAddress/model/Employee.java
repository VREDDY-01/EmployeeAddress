package com.vishnu.EmployeeAddress.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	@Id
	private Long id;
	private String firstName;
	private String lastName;
	@OneToOne
	@JoinColumn(name = "fk_addressId")
	Address address;
}
