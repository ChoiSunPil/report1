package org.sopt.model.service;

import org.sopt.model.Department;

public interface DepartmentService {

    Department getByDepartmentName(final String name);

}
