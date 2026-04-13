package com.liquibase.Example.liquibase.service.EmployeeService.java;

import com.liquibase.Example.liquibase.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(Long id);
    User save(User user);
    User update(Long id, User user);
    void delete(Long id);
    List<User> search(String keyword);

    User getByEmail(String email);

    long countUsers();

    Page<User> getActiveUsers(Pageable pageable);

    User deactivateUser(Long id);

    boolean existsByEmail(String email);
}