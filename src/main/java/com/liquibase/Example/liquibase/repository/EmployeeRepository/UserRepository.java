package com.liquibase.Example.liquibase.repository.EmployeeRepository;
import com.liquibase.Example.liquibase.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
