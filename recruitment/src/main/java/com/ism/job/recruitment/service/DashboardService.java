package com.ism.job.recruitment.service;

import com.ism.job.recruitment.dto.DashboardCountDTO;

public interface DashboardService {

	// get min year of vacancy
	public int getMinYear();

	public DashboardCountDTO getDashboardCounts(int year);

	public DashboardCountDTO getDashboardCountsForDepartment(int year, int department);

}