package com.baviya.college.service;
import com.baviya.college.entity.Department;

import java.util.List;

    // Interface
    public interface DepartmentService {

        // Save operation
        Department saveDepartment(Department department);

        // Read operation
        List<Department> fetchDepartmentList();

        // Update operation
        Department updateDepartment(Department department,
                                    Long departmentId);

        // Delete operation
        void deleteDepartmentById(Long departmentId);
    }


