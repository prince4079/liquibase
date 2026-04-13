package com.liquibase.Example.liquibase.service.EmployeeService.java;

import com.liquibase.Example.liquibase.entity.Admin;

import java.util.List;

public interface AdminService {

    List<Admin> getAll();

    Admin getById(Long id);

    Admin create(Admin admin);

    Admin update(Long id, Admin admin);

    void delete(Long id);
}