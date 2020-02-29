package com.devroods.buildingrestservices;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<
Employee, Long>{
  
}