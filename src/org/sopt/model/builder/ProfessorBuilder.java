package org.sopt.model.builder;

import org.sopt.model.Professor;
import org.sopt.model.University;

public class ProfessorBuilder extends DepartmentBuilder{
    private int pro_num;
    private String pro_name;
    private String pro_major;
    private String pro_phone;
    private String pro_subject;

    public ProfessorBuilder setPro_num(final int pro_num) {
        this.pro_num = pro_num;
        return this;
    }

    public ProfessorBuilder setPro_name(final String pro_name) {
        this.pro_name = pro_name;
        return this;
    }
    public ProfessorBuilder setPro_major(final String pro_major) {
        this.pro_major = pro_major;
        return this;
    }
    public ProfessorBuilder setPro_phone(final String pro_phone) {
        this.pro_phone = pro_phone;
        return this;
    }
    public ProfessorBuilder setPro_subject(final String pro_subject) {
        this.pro_subject = pro_subject;
        return this;
    }


    @Override
    public University build(){

        return new Professor(univ_num, univ_name,  univ_phone,  univ_address, dept_num,  dept_name,  dept_phone,  dept_type,pro_num,pro_name,pro_major,pro_phone,pro_subject);
    }

}
