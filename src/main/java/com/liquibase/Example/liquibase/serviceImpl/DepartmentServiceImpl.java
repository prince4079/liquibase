package com.liquibase.Example.liquibase.serviceImpl;

import com.liquibase.Example.liquibase.entity.Department;
import com.liquibase.Example.liquibase.repository.EmployeeRepository.DepartmentRepository;
import com.liquibase.Example.liquibase.service.EmployeeService.java.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository repository;

    public DepartmentServiceImpl(DepartmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Department> getAll() {
        return repository.findAll();
    }

    @Override
    public Department getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found"));
    }

    @Override
    public Department create(Department department) {
        return repository.save(department);
    }

    @Override
    public Department update(Long id, Department department) {
        Department existing = getById(id);

        existing.setName(department.getName());
        existing.setLocation(department.getLocation());
        existing.setDescription(department.getDescription());

        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}