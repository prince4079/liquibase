package com.liquibase.Example.liquibase.repository.EmployeeRepository;

import com.liquibase.Example.liquibase.entity.Employee;
import com.liquibase.Example.liquibase.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
