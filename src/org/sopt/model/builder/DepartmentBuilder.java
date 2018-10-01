package org.sopt.model.builder;

import org.sopt.model.Department;
import org.sopt.model.University;

public class DepartmentBuilder extends UniversityBuilder{
    protected int dept_num;
    protected String dept_name;
    protected String dept_phone;
    protected String dept_type;

    public DepartmentBuilder setDept_num(final int num) {
        this.dept_num = num;
        return this;
    }

    public DepartmentBuilder setDept_name(final String name) {
        this.dept_name = name;
        return this;
    }

    public DepartmentBuilder setDept_phone(final String phone) {
        this.dept_phone = phone;
        return this;
    }

    public DepartmentBuilder setDept_type(final String type) {
        this.dept_type = type;
        return this;
    }

    @Override
    public University build(){

        return new Department(univ_num, univ_name,  univ_phone,  univ_address, dept_num,  dept_name,  dept_phone,  dept_type);
    }



}
