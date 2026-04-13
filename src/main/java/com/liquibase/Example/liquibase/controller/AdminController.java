package com.liquibase.Example.liquibase.controller;

import com.liquibase.Example.liquibase.entity.Admin;
import com.liquibase.Example.liquibase.service.EmployeeService.java.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admins")
public class AdminController {

    private final AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }

    // GET all admins
    @GetMapping
    public List<Admin> findAll() {
        return service.getAll();
    }

    // GET admin by id
    @GetMapping("/{id}")
    public Admin findOne(@PathVariable Long id) {
        return service.getById(id);
    }

    // CREATE admin
    @PostMapping
    public Admin create(@RequestBody Admin admin) {
        return service.create(admin);
    }

    // UPDATE admin
    @PutMapping("/{id}")
    public Admin update(@PathVariable Long id, @RequestBody Admin admin) {
        return service.update(id, admin);
    }

    // DELETE admin
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
