package com.liquibase.Example.liquibase.repository.EmployeeRepository;

import com.liquibase.Example.liquibase.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {

    Admin findByEmail(String email);

    boolean existsByEmail(String email);
}