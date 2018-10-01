package org.sopt.model.builder;

import org.sopt.model.University;

public class UniversityBuilder {
    protected int univ_num;
    protected String univ_name;
    protected String univ_phone;
    protected String univ_address;

    public UniversityBuilder setUniv_num(final int num) {
        this.univ_num = num;
        return this;
    }
    public UniversityBuilder setUniv_name(final String name) {
        this.univ_name = name;
        return this;
    }

    public UniversityBuilder setUniv_phone(final String phone) {
        this.univ_phone = phone;
        return this;
    }

    public UniversityBuilder setUniv_address(final String address) {
        this.univ_address = address;
        return this;
    }
    public University build(){
        return new University(this.univ_num,this.univ_name,this.univ_phone,this.univ_address);
    }



}
