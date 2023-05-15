package com.infosys.infytel.planMS.dto;

import com.infosys.infytel.planMS.Entity.Plan;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanDto {

    Integer planId;
	
	String planName;

	Integer nationalRate;

	Integer localRate;
	
	
	// Converts Entity into DTO
		public static PlanDto valueOf(Plan plan) {
			PlanDto planDTO= new PlanDto();
			planDTO.setLocalRate(plan.getLocalRate());
			planDTO.setNationalRate(plan.getNationalRate());
			planDTO.setPlanId(plan.getPlanId());
			planDTO.setPlanName(plan.getPlanName());
			return planDTO;
		}
}
