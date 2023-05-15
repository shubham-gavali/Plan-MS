package com.infosys.infytel.planMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.planMS.Entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Integer>{

}
