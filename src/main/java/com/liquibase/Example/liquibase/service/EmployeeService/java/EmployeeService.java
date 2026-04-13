package com.liquibase.Example.liquibase.service.EmployeeService.java;

import com.liquibase.Example.liquibase.entity.Employee;
import com.liquibase.Example.liquibase.repository.EmployeeRepository.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAll() { return repository.findAll(); }

    public Employee save(Employee emp) { return repository.save(emp); }

    public Employee getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
    }

    public void delete(Long id) { repository.deleteById(id); }
}
