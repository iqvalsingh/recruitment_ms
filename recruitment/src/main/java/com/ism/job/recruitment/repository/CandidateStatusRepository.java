package com.ism.job.recruitment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ism.job.recruitment.entity.CandidateStatus;

@Repository
public interface CandidateStatusRepository extends JpaRepository<CandidateStatus, Long> {
	List<CandidateStatus> findByCandidateId(Long candidateId);
}
