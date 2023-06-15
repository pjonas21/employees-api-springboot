package com.pjonas.employees.service;

import java.util.List;
import java.util.Optional;

import com.pjonas.employees.models.EmployeeModel;

public interface EmployeeService {

    List<EmployeeModel> findAll();
    Optional<EmployeeModel> findById(String id);
    EmployeeModel save(EmployeeModel employeeModel);
    void delete(EmployeeModel employeeModel);
    
}
