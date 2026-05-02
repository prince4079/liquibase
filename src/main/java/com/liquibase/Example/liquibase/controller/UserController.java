package com.liquibase.Example.liquibase.controller;
import com.liquibase.Example.liquibase.entity.User;
import com.liquibase.Example.liquibase.service.EmployeeService.java.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
        System.out.println("the change i want to male on the feat/dept branch");
        return service.save(user);
    }

    // UPDATE user
    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        System.out.println("the change i want to male on the feat/dept branch");

        return service.update(id, user);
    }

    // DELETE user
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        System.out.println("the change i want to male on the feat/dept branch");

        service.delete(id);
    }

    // 🔍 Search users
    @GetMapping("/search")
    public List<User> search(@RequestParam String keyword) {
        System.out.println("the change i want to male on the feat/dept branch");

        return service.search(keyword);
    }

    // 📧 Get by email
    @GetMapping("/email/{email}")
    public User getByEmail(@PathVariable String email) {
        System.out.println("the change i want to male on the feat/dept branch");

        return service.getByEmail(email);
    }

    // 🔢 Count users
    @GetMapping("/count")
    public long count() {
        System.out.println("the change i want to male on the feat/dept branch");


        return service.countUsers();
    }

    // 📄 Pagination (only active users)
    @GetMapping("/active")
    public Page<User> getActiveUsers(Pageable pageable) {

        System.out.println("the change i want to male on the feat/dept branch");

        return service.getActiveUsers(pageable);
    }

    // 🚫 Deactivate user
    @PutMapping("/{id}/deactivate")
    public User deactivate(@PathVariable Long id) {
        System.out.println("the change i want to male on the feat/dept branch");

        return service.deactivateUser(id);
    }

    // ✅ Check email exists
    @GetMapping("/exists")
    public boolean exists(@RequestParam String email) {
        System.out.println("the change i want to male on the feat/dept branch");

        return service.existsByEmail(email);
    }
}
