package com.ism.job.recruitment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ism.job.recruitment.entity.Reviews;

@Repository
public interface ReviewRepository extends JpaRepository<Reviews, Long> {

}
