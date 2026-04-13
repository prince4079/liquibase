package com.liquibase.Example.liquibase.service.EmployeeService.java;

import com.liquibase.Example.liquibase.entity.User;
import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(Long id);
    User save(User user);
    User update(Long id, User user);
    void delete(Long id);
}