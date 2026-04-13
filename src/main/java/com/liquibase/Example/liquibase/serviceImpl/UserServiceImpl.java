package com.liquibase.Example.liquibase.serviceImpl;
import com.liquibase.Example.liquibase.entity.User;
import com.liquibase.Example.liquibase.repository.EmployeeRepository.UserRepository;
import com.liquibase.Example.liquibase.service.EmployeeService.java.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public User getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public User update(Long id, User user) {
        User existing = getById(id);
        existing.setFullName(user.getFullName());
        existing.setEmail(user.getEmail());
        existing.setPhoneNumber(user.getPhoneNumber());
        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
