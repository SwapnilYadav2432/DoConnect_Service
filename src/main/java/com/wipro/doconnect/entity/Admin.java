package com.wipro.doconnect.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank(message = "name is mandatory field")
	private String name;
	
	@NotBlank(message = "password the mandatory field")
	@Size(min = 8, message = "length should be 8")
	private String password;
	
	@NotBlank(message = "email is mandatory field")
	@Email(message = "provide a valid email only")
	private String email;
	
	@NotBlank(message = "phone Number is mandatory field")
	@Size(max = 10, min = 10)
	private String phoneNumber;

	private Boolean isActive = true;

}
