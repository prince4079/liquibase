package com.liquibase.Example.liquibase.serviceImpl;


import com.liquibase.Example.liquibase.entity.Admin;
import com.liquibase.Example.liquibase.repository.EmployeeRepository.AdminRepository;
import com.liquibase.Example.liquibase.service.EmployeeService.java.AdminService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    private final AdminRepository repository;

    public AdminServiceImpl(AdminRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Admin> getAll() {
        return repository.findAll();
    }

    @Override
    public Admin getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Admin not found"));
    }

    @Override
    public Admin create(Admin admin) {
        if (repository.existsByEmail(admin.getEmail())) {
            throw new RuntimeException("Email already exists");
        }
        return repository.save(admin);
    }

    @Override
    public Admin update(Long id, Admin admin) {
        Admin existing = getById(id);

        existing.setName(admin.getName());
        existing.setEmail(admin.getEmail());
        existing.setRole(admin.getRole());

        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}