package com.liquibase.Example.liquibase.repository.EmployeeRepository;

import com.liquibase.Example.liquibase.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Standard CRUD methods are built-in
}
