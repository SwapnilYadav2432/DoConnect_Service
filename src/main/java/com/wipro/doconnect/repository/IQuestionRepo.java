package com.wipro.doconnect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.doconnect.entity.Question;

@Repository
public interface IQuestionRepo extends JpaRepository<Question, Long> {

	// method to find question which are not approved by admin
	@Query("from Question where isApproved = false")
	public List<Question> findByIsApproved();

	// method to find question by approved status by admin
	@Query("from Question where isApproved = true")
	public List<Question> findByIsApprovedTrue();

	// method to find question by topic and approved status by admin
	@Query("from Question where topic =?1 and isApproved = true")
	public List<Question> findByTopicAndApproved(String topic);

}
