package com.ism.job.recruitment.repository;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ism.job.recruitment.entity.MailHistory;

public interface MailHistoryRepository
		extends JpaRepository<MailHistory, Long>, DataTablesRepository<MailHistory, Long> {

}