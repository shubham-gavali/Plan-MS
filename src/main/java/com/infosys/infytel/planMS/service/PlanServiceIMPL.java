package com.infosys.infytel.planMS.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.infytel.planMS.Entity.Plan;
import com.infosys.infytel.planMS.dto.PlanDto;
import com.infosys.infytel.planMS.repository.PlanRepo;

@Service
public class PlanServiceIMPL implements PlanServiceI{

	@Autowired
	private PlanRepo planRepo;
	
	
	public PlanDto getSpecificPlan(Integer planId) {
	
		return PlanDto.valueOf(this.planRepo.findById(planId).get());
	}


	@Override
	public List<PlanDto> getAllPlans() {
		List<Plan> plans = this.planRepo.findAll();
		List<PlanDto> planDto=new ArrayList<>();
		for(Plan plan:plans) {
			 planDto.add(PlanDto.valueOf(plan));
		};
		return planDto;
	}

	
}
