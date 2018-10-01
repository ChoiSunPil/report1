package org.sopt.model;

public class Student extends Department{
    private int stu_id;
    private String stu_name;
    private String stu_grade;
    private String stu_major;
    private String stu_email;
    private String stu_address;
    private String stu_age;
    private String stu_state;

    public Student() {
    }

    public Student(int univ_num, String univ_name, String univ_phone, String univ_address, int dept_num, String dept_name, String dept_phone, String dept_type, int stu_id, String stu_name, String stu_grade, String stu_major, String stu_email, String stu_address, String stu_age, String stu_state) {
        super(univ_num, univ_name, univ_phone, univ_address, dept_num, dept_name, dept_phone, dept_type);
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_grade = stu_grade;
        this.stu_major = stu_major;
        this.stu_email = stu_email;
        this.stu_address = stu_address;
        this.stu_age = stu_age;
        this.stu_state = stu_state;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_grade() {
        return stu_grade;
    }

    public void setStu_grade(String stu_grade) {
        this.stu_grade = stu_grade;
    }

    public String getStu_major() {
        return stu_major;
    }

    public void setStu_major(String stu_major) {
        this.stu_major = stu_major;
    }

    public String getStu_email() {
        return stu_email;
    }

    public void setStu_email(String stu_email) {
        this.stu_email = stu_email;
    }

    public String getStu_address() {
        return stu_address;
    }

    public void setStu_address(String stu_address) {
        this.stu_address = stu_address;
    }

    public String getStu_age() {
        return stu_age;
    }

    public void setStu_age(String stu_age) {
        this.stu_age = stu_age;
    }

    public String getStu_state() {
        return stu_state;
    }

    public void setStu_state(String stu_state) {
        this.stu_state = stu_state;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                ", stu_name='" + stu_name + '\'' +
                ", stu_grade='" + stu_grade + '\'' +
                ", stu_major='" + stu_major + '\'' +
                ", stu_email='" + stu_email + '\'' +
                ", stu_address='" + stu_address + '\'' +
                ", stu_age='" + stu_age + '\'' +
                ", stu_state='" + stu_state + '\'' +
                '}';
    }
}
