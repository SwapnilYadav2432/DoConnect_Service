package com.wipro.doconnect.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.doconnect.entity.ImageModel;

@Repository
public interface IImageModelRepo extends JpaRepository<ImageModel, Long> {

	// method to find imageModel by it's name
	public Optional<ImageModel> findByName(String name);

}
