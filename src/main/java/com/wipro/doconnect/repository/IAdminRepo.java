package com.wipro.doconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.doconnect.entity.Admin;

@Repository
public interface IAdminRepo extends JpaRepository<Admin, Long> {

	// method to find admin by email
	public Admin findByEmail(String email);

}
