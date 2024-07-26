package com.poc.department.restapi;

import com.poc.department.model.Department;
import com.poc.department.service.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentAPI {

    private DepartmentService departmentService;

    public DepartmentAPI(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/department/{id}")
    public ResponseEntity<Department> getDepartment(@PathVariable("id") Long id) {
        return ResponseEntity.ok()
                .body(departmentService.getDepartment(id));
    }

    @PostMapping("/department")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
        return ResponseEntity.ok()
                .body(departmentService.createDepartment(department));
    }
}
