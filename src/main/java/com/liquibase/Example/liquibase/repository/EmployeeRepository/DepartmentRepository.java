package com.liquibase.Example.liquibase.repository.EmployeeRepository;
import com.liquibase.Example.liquibase.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
