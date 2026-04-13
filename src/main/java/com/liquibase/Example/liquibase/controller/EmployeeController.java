package com.liquibase.Example.liquibase.controller;

import com.liquibase.Example.liquibase.entity.Employee;
import com.liquibase.Example.liquibase.service.EmployeeService.java.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Employee> findAll() { return service.getAll(); }

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return service.save(employee);
    }

    @GetMapping("/{id}")
    public Employee findOne(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id) {
        service.delete(id);
    }
}