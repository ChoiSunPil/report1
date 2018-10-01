package org.sopt.model;

public class Department extends University {
 private int dept_num;
 private String dept_name;
 private String dept_phone;
 private String dept_type;

    public Department() {
        super();
    }

    public Department(int univ_num, String univ_name, String univ_phone, String univ_address, int dept_num, String dept_name, String dept_phone, String dept_type) {
        super(univ_num, univ_name, univ_phone, univ_address);
        this.dept_num = dept_num;
        this.dept_name = dept_name;
        this.dept_phone = dept_phone;
        this.dept_type = dept_type;
    }

    public int getDept_num() {
        return dept_num;
    }

    public void setDept_num(int dept_num) {
        this.dept_num = dept_num;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getDept_phone() {
        return dept_phone;
    }

    public void setDept_phone(String dept_phone) {
        this.dept_phone = dept_phone;
    }

    public String getDept_type() {
        return dept_type;
    }

    public void setDept_type(String dept_type) {
        this.dept_type = dept_type;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dept_num=" + dept_num +
                ", dept_name='" + dept_name + '\'' +
                ", dept_phone='" + dept_phone + '\'' +
                ", dept_type='" + dept_type + '\'' +
                '}';
    }
}
