package com.pjonas.employees.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pjonas.employees.dtos.EmployeeDto;
import com.pjonas.employees.models.EmployeeModel;
import com.pjonas.employees.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
// cors config for frontend
// can be changed depends of app url
@CrossOrigin(origins = "*")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeModel>> getAllEmployees() {
        List<EmployeeModel> employeeList = employeeService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(employeeList);
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Object> getOneEmployee(@PathVariable(value = "id") String id) {
        Optional<EmployeeModel> employeeObj = employeeService.findById(id);
        if(employeeObj.isEmpty()) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found on DB.");
        return ResponseEntity.status(HttpStatus.OK).body(employeeObj.get());
    }

    @PostMapping("/employees")
    public ResponseEntity<EmployeeModel> saveEmployee(@RequestBody @Valid EmployeeDto employeeDto) {
        var employeeModel = new EmployeeModel();
        BeanUtils.copyProperties(employeeDto, employeeModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.save(employeeModel));
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Object> updateEmployee(@PathVariable(value = "id") String id, @RequestBody @Valid EmployeeDto employeeDto) {

        Optional<EmployeeModel> employeeObj = employeeService.findById(id);
        if(employeeObj.isEmpty()) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found on DB.");
        var employeeModel = employeeObj.get();
        BeanUtils.copyProperties(employeeDto, employeeModel);
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.save(employeeModel));

    }
    
}
