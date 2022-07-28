package com.wipro.doconnect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.doconnect.entity.Answer;

@Repository
public interface IAnswerRepo extends JpaRepository<Answer, Long> {

	// method to find answer by question id and isApproved status
	@Query("from Answer where question.id = ?1 and isApproved = true")
	public List<Answer> findByQuestionId(Long questionId);

	// method to find answers which are not approved by admin
	@Query("from Answer where isApproved = false")
	public List<Answer> findByIsApproved();
}
