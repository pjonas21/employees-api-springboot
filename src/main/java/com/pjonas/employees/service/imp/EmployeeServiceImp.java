package com.pjonas.employees.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pjonas.employees.models.EmployeeModel;
import com.pjonas.employees.repository.EmployeeRepository;
import com.pjonas.employees.service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    EmployeeServiceImp (EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeModel> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeModel> findById(String id) {
        return employeeRepository.findById(id);
    }

    @Override
    public EmployeeModel save(EmployeeModel employeeModel) {
        return employeeRepository.save(employeeModel);
    }

    @Override
    public void delete(EmployeeModel employeeModel) {
        employeeRepository.delete(employeeModel);
    }
    
}
