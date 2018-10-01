package org.sopt.model;

public class Professor extends Department {
    private int pro_num;
    private String pro_name;
    private String pro_major;
    private String pro_phone;
    private String pro_subject;


    public Professor() {
        super();
    }

    public Professor(int univ_num, String univ_name, String univ_phone, String univ_address, int dept_num, String dept_name, String dept_phone, String dept_type, int pro_num, String pro_name, String pro_major, String pro_phone, String pro_subject) {
        super(univ_num, univ_name, univ_phone, univ_address, dept_num, dept_name, dept_phone, dept_type);
        this.pro_num = pro_num;
        this.pro_name = pro_name;
        this.pro_major = pro_major;
        this.pro_phone = pro_phone;
        this.pro_subject = pro_subject;
    }

    public int getPro_num() {
        return pro_num;
    }

    public void setPro_num(int pro_num) {
        this.pro_num = pro_num;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getPro_major() {
        return pro_major;
    }

    public void setPro_major(String pro_major) {
        this.pro_major = pro_major;
    }

    public String getPro_phone() {
        return pro_phone;
    }

    public void setPro_phone(String pro_phone) {
        this.pro_phone = pro_phone;
    }

    public String getPro_subject() {
        return pro_subject;
    }

    public void setPro_subject(String pro_subject) {
        this.pro_subject = pro_subject;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "pro_num=" + pro_num +
                ", pro_name='" + pro_name + '\'' +
                ", pro_major='" + pro_major + '\'' +
                ", pro_phone='" + pro_phone + '\'' +
                ", pro_subject='" + pro_subject + '\'' +
                '}';
    }
}
