package org.sopt.model.builder;

import org.sopt.model.Student;
import org.sopt.model.University;

public class StudentBuilder extends DepartmentBuilder{
    private int stu_id;
    private String stu_name;
    private String stu_grade;
    private String stu_major;
    private String stu_email;
    private String stu_address;
    private String stu_age;
    private String stu_state;



    public StudentBuilder setStu_id(final int stu_id) {
        this.stu_id = stu_id;
        return this;
    }

    public StudentBuilder setStu_name(final String stu_name) {
        this.stu_name = stu_name;
        return this;
    }
    public StudentBuilder setStu_grade(final String stu_grade) {
        this.stu_grade = stu_grade;
        return this;
    }
    public StudentBuilder setStu_major(final String stu_major) {
        this.stu_major = stu_major;
        return this;
    }
    public StudentBuilder setStu_email(final String stu_email) {
        this.stu_email = stu_email;
        return this;
    }
    public StudentBuilder setStu_address(final String stu_address) {
        this.stu_address = stu_address;
        return this;
    }
    public StudentBuilder setStu_age(final String stu_age) {
        this.stu_age = stu_age;
        return this;
    }
    public StudentBuilder setStu_state(final String stu_state) {
        this.stu_state = stu_state;
        return this;
    }









    @Override
    public University build(){

        return new Student(univ_num, univ_name,  univ_phone,  univ_address, dept_num,  dept_name,  dept_phone,  dept_type, stu_id,  stu_name,  stu_grade,  stu_major,  stu_email,  stu_address,  stu_age,  stu_state);
    }

}
