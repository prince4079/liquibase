package com.liquibase.Example.liquibase.controller;

import com.liquibase.Example.liquibase.entity.Department;
import com.liquibase.Example.liquibase.service.EmployeeService.java.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    // GET all
    @GetMapping
    public List<Department> findAll() {
        System.out.println("print is added ");
        System.out.println("print is added ");
        System.out.println("print is added ");
        System.out.println("print is added ");
        return service.getAll();
    }

    // GET by id
    @GetMapping("/{id}")
    public Department findOne(@PathVariable Long id) {
        return service.getById(id);
    }

    // CREATE
    @PostMapping
    public Department create(@RequestBody Department department) {
        return service.create(department);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Department update(@PathVariable Long id, @RequestBody Department department) {
        return service.update(id, department);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }}
