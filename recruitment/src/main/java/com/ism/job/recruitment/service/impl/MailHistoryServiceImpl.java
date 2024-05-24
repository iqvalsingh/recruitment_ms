package com.ism.job.recruitment.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Service;

import com.ism.job.recruitment.entity.MailHistory;
import com.ism.job.recruitment.repository.MailHistoryRepository;
import com.ism.job.recruitment.service.MailHistoryService;

@Service
public class MailHistoryServiceImpl implements MailHistoryService {
	@Autowired
	MailHistoryRepository mailHistoryRepository;

	@Override
	public MailHistory storeMailHistory(MailHistory mailHistory) {
		return mailHistoryRepository.save(mailHistory);
	}

	@Override
	public List<MailHistory> getAllMailHistory() {
		return mailHistoryRepository.findAll();
	}

	@Override
	public DataTablesOutput<MailHistory> getDataTableData(@Valid DataTablesInput input) {
		return mailHistoryRepository.findAll(input);
	}

}