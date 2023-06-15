package com.pjonas.employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pjonas.employees.models.EmployeeModel;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, String>{
    
}
