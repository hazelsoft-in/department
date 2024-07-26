package com.poc.department.service;

import com.poc.department.mapper.DepartmentMapper;
import com.poc.department.model.Department;
import com.poc.department.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    private DepartmentMapper departmentMapper;

    public DepartmentService(DepartmentRepository departmentRepository,
                             DepartmentMapper departmentMapper) {
        this.departmentRepository = departmentRepository;
        this.departmentMapper = departmentMapper;
    }

    public Department getDepartment(Long id) {
        return departmentMapper.toDepartmentModel(departmentRepository.findById(id).get());
    }

    public Department createDepartment(Department department) {
        com.poc.department.entity.Department department1 = departmentRepository.
                save(departmentMapper.toDeptEntity(department));
        return departmentMapper.toDepartmentModel(department1);
    }
}
