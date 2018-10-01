package org.sopt.model.service.impl;

import org.sopt.model.Department;
import org.sopt.model.builder.DepartmentBuilder;
import org.sopt.model.service.DepartmentService;

import java.util.ArrayList;

public class DepartmentServiceImpl implements DepartmentService {
    ArrayList<Department> departmentArrayList;

    public void setDepartmentArrayList(ArrayList<Department> list)
    {

        departmentArrayList = list;
    }

    @Override
    public Department getByDepartmentName(String name) {
        for(Department department:departmentArrayList)
        {
            if(department.getDept_name() == name)
            {
                DepartmentBuilder departmentBuilder = new DepartmentBuilder();
                Department copy = (Department) departmentBuilder
                        .setDept_name(department.getDept_name())
                        .setDept_phone(department.getDept_phone())
                        .setDept_type(department.getDept_type())
                        .setDept_num(department.getDept_num())
                        .setUniv_name(department.getUniv_name())
                        .setUniv_num(department.getDept_num())
                        .setUniv_phone(department.getDept_phone())
                        .setUniv_address(department.getUniv_address())
                        .build();

                return copy;
            }



        }





        return null;
    }
}
