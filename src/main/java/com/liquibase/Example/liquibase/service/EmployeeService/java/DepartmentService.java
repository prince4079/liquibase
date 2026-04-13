package com.liquibase.Example.liquibase.service.EmployeeService.java;
import com.liquibase.Example.liquibase.entity.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> getAll();

    Department getById(Long id);

    Department create(Department department);

    Department update(Long id, Department department);

    void delete(Long id);
}