package com.infosys.infytel.planMS.service;

import java.util.List;

import com.infosys.infytel.planMS.dto.PlanDto;


public interface PlanServiceI {

	public PlanDto getSpecificPlan(Integer planId);
	
	public List<PlanDto> getAllPlans();
}
