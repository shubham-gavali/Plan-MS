package com.infosys.infytel.planMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.infytel.planMS.dto.PlanDto;
import com.infosys.infytel.planMS.service.PlanServiceI;

@RestController
public class PlanController {

	@Autowired
	private PlanServiceI planService;
	
	@GetMapping(value = "/plan/{planId}", produces = "application/json")
	public PlanDto getSpecificPlan(@PathVariable Integer planId) {
		return this.planService.getSpecificPlan(planId);
	}
	
	@GetMapping(value = "/plan", produces = "application/json")
	public List<PlanDto> getAllPlans(){
	    return this.planService.getAllPlans();
	}
	
}
