package com.poc.department.repository;

import com.poc.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Optional<Department> findById(Long id);

    Department save(Department department);
}
