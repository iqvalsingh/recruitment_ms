package com.ism.job.recruitment.service;

import java.util.List;

import com.ism.job.recruitment.entity.CandidateStatus;

public interface CandidateStatusService {
	CandidateStatus saveCandidateStatus(CandidateStatus candidateStatus);

	List<CandidateStatus> getAllByCandidateId(long id);

}
