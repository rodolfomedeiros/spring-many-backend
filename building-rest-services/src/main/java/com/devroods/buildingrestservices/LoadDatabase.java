package com.devroods.buildingrestservices;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase{
  
  @Bean
  CommandLineRunner initDatabase(EmployeeRepository employeeRepository) {
    return args -> {
      employeeRepository.save(new Employee("Bilbo Baggins", "burglar"));
      employeeRepository.save(new Employee("Frodo Baggins", "thief"));
    }; 
  }
}