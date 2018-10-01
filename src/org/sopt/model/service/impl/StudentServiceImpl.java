package org.sopt.model.service.impl;

import org.sopt.model.Professor;
import org.sopt.model.Student;
import org.sopt.model.builder.ProfessorBuilder;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.model.service.StudentService;

import java.util.ArrayList;

public class StudentServiceImpl implements StudentService {
     ArrayList<Student> studentArrayList;


    public void setStudentArrayList(ArrayList<Student> list)
    {
        studentArrayList = list;
    }
    @Override
    public Student getByStudentIdx(int StudentIdx) {
        for(Student student : studentArrayList)
        {
            if(student.getStu_id() == StudentIdx)
            {
                StudentBuilder studentBuilder = new StudentBuilder();
                Student copy = (Student)studentBuilder
                        .setStu_address(student.getStu_address())
                        .setStu_age(student.getStu_age())
                        .setStu_email(student.getStu_email())
                        .setStu_grade(student.getStu_grade())
                        .setStu_id(student.getStu_id())
                        .setStu_state(student.getStu_state())
                        .setStu_name(student.getStu_name())
                        .setStu_major(student.getStu_major())
                        .setDept_num(student.getDept_num())
                        .setDept_type(student.getDept_type())
                        .setDept_phone(student.getDept_phone())
                        .setDept_name(student.getDept_name())
                        .setUniv_address(student.getUniv_address())
                        .setUniv_name(student.getUniv_name())
                        .setUniv_phone(student.getUniv_phone())
                        .setUniv_num(student.getUniv_num())
                        .build();

                return copy;
            }
        }



        return null;
    }
}
