package com.ism.job.recruitment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.ism.job.recruitment.entity.Position;
import com.ism.job.recruitment.model.AppUserDetails;
import com.ism.job.recruitment.repository.PositionRepository;
import com.ism.job.recruitment.service.PositionService;

@Service
public class PositionServiceImpl implements PositionService {

	@Autowired
	PositionRepository positionRepository;

	@Override
	public int getCurrentUserId(Authentication authentication) {
		AppUserDetails appUserDetails = (AppUserDetails) authentication.getPrincipal();
		return appUserDetails.getId();
	}

	@Override
	public Position addPosition(Position position) {
		return positionRepository.save(position);
	}

	@Override
	public Position getPositionById(int id) {
		return positionRepository.findById(id).get();
	}

	@Override
	public List<Position> getPositionByName(String name) {
		return positionRepository.findByName(name);
	}

	@Override
	public Position updatePosition(Position position) {
		return positionRepository.save(position);
	}

	@Override
	public DataTablesOutput<Position> getDataTableData(DataTablesInput input) {
		return positionRepository.findAll(input);
	}

	@Override
	public List<Position> getAllPositions() {
		return positionRepository.findAll();
	}

}
