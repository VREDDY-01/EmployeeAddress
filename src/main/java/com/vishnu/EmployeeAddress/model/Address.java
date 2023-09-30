package com.vishnu.EmployeeAddress.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
	@Id
	private Long id;
	private String Street;
	private String City;
	private String State;
	private String Zipcode;
}
