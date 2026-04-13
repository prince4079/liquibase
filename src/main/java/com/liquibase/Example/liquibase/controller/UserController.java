package com.liquibase.Example.liquibase.controller;
import com.liquibase.Example.liquibase.entity.User;
import com.liquibase.Example.liquibase.service.EmployeeService.java.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    // GET all users
    @GetMapping
    public List<User> findAll() {
        return service.getAll();
    }

    // GET user by id
    @GetMapping("/{id}")
    public User findOne(@PathVariable Long id) {
        return service.getById(id);
    }

    // CREATE user
    @PostMapping
    public User create(@RequestBody User user) {
        return service.save(user);
    }

    // UPDATE user
    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        return service.update(id, user);
    }

    // DELETE user
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
