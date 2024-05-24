package com.ism.job.recruitment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ism.job.recruitment.entity.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {
	Status findByName(String name);
}
