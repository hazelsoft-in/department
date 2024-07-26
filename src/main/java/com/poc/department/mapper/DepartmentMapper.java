package com.poc.department.mapper;

import com.poc.department.model.Department;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    Department toDepartmentModel(com.poc.department.entity.Department department);

    com.poc.department.entity.Department toDeptEntity(Department department);
}
