package org.sopt;

import org.sopt.model.Department;
import org.sopt.model.Professor;
import org.sopt.model.Student;
import org.sopt.model.University;
import org.sopt.model.builder.DepartmentBuilder;
import org.sopt.model.builder.ProfessorBuilder;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.model.builder.UniversityBuilder;
import org.sopt.model.service.ProfessorService;
import org.sopt.model.service.impl.DepartmentServiceImpl;
import org.sopt.model.service.impl.ProfessorServiceImpl;
import org.sopt.model.service.impl.StudentServiceImpl;
import org.sopt.model.service.impl.UniversityServiceImpl;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //힉생
        ArrayList<Student> studentArrayList = new ArrayList<>();
        StudentBuilder studentBuilder = new StudentBuilder();
        Student s1 = (Student)studentBuilder
                .setStu_address("상도동 120-15")
                .setStu_age("21")
                .setStu_email("roung4119@naver.com")
                .setStu_grade("3")
                .setStu_id(20142450)
                .setStu_state("재학")
                .setStu_name("최선필")
                .setStu_major("컴퓨터학부")
                .setDept_num(1)
                .setDept_type("IT대")
                .setDept_phone("054-473-4118")
                .setDept_name("컴퓨터학부")
                .setUniv_address("동작구 상도동 숭실대학교")
                .setUniv_name("숭실대학교")
                .setUniv_phone("02-111-1111")
                .setUniv_num(1)
                .build();
        Student s2 = (Student)studentBuilder
                .setStu_address("상도동 120-15")
                .setStu_age("21")
                .setStu_email("roung4119@naver.com")
                .setStu_grade("3")
                .setStu_id(20132450)
                .setStu_state("재학")
                .setStu_name("이정재")
                .setStu_major("컴퓨터학부")
                .setDept_num(1)
                .setDept_type("IT대")
                .setDept_phone("054-473-4118")
                .setDept_name("컴퓨터학부")
                .setUniv_address("동작구 상도동 숭실대학교")
                .setUniv_name("숭실대학교")
                .setUniv_phone("02-111-1111")
                .setUniv_num(1)
                .build();
        Student s3 = (Student)studentBuilder
                .setStu_address("상도동 120-15")
                .setStu_age("21")
                .setStu_email("roung4119@naver.com")
                .setStu_grade("3")
                .setStu_id(20152450)
                .setStu_state("재학")
                .setStu_name("심지용")
                .setStu_major("컴퓨터학부")
                .setDept_num(1)
                .setDept_type("IT대")
                .setDept_phone("054-473-4118")
                .setDept_name("컴퓨터학부")
                .setUniv_address("동작구 상도동 숭실대학교")
                .setUniv_name("숭실대학교")
                .setUniv_phone("02-111-1111")
                .setUniv_num(1)
                .build();


        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        for(Student s : studentArrayList){
            System.out.println(s.toString());
        }

        StudentServiceImpl studentService = new StudentServiceImpl();
        studentService.setStudentArrayList(studentArrayList);
        System.out.println(studentService.getByStudentIdx(20132450).toString());



        //교수

        ArrayList<Professor> professorArrayList = new ArrayList<>();
        ProfessorBuilder professorBuilder = new ProfessorBuilder();
        Professor p1 = (Professor) professorBuilder
                .setPro_major("인공지능")
                .setPro_name("황규백")
                .setPro_num(1)
                .setPro_phone("010-2222-2222")
                .setPro_subject("AI")
                .setDept_num(1)
                .setDept_type("IT대")
                .setDept_phone("054-473-4118")
                .setDept_name("컴퓨터학부")
                .setUniv_address("동작구 상도동 숭실대학교")
                .setUniv_name("숭실대학교")
                .setUniv_phone("02-111-1111")
                .setUniv_num(1)
                .build();

        Professor p2 = (Professor) professorBuilder
                .setPro_major("데이터베이스")
                .setPro_name("박동주")
                .setPro_num(2)
                .setPro_phone("010-2222-2222")
                .setPro_subject("AI")
                .setDept_num(1)
                .setDept_type("IT대")
                .setDept_phone("054-473-4118")
                .setDept_name("컴퓨터학부")
                .setUniv_address("동작구 상도동 숭실대학교")
                .setUniv_name("숭실대학교")
                .setUniv_phone("02-111-1111")
                .setUniv_num(1)
                .build();

        Professor p3 = (Professor) professorBuilder
                .setPro_major("영상처리")
                .setPro_name("이정진")
                .setPro_num(3)
                .setPro_phone("010-2222-2222")
                .setPro_subject("AI")
                .setDept_num(1)
                .setDept_type("IT대")
                .setDept_phone("054-473-4118")
                .setDept_name("컴퓨터학부")
                .setUniv_address("동작구 상도동 숭실대학교")
                .setUniv_name("숭실대학교")
                .setUniv_phone("02-111-1111")
                .setUniv_num(1)
                .build();


        professorArrayList.add(p1);
        professorArrayList.add(p2);
        professorArrayList.add(p3);
        for(Professor p : professorArrayList)
        {
            System.out.println(p.toString());
        }


        ProfessorServiceImpl professorService =  new ProfessorServiceImpl();
        professorService.setList(professorArrayList);
        System.out.println(professorService.getByProfessorNum(2).toString());


        //학부

        ArrayList<Department> departmentArrayList = new ArrayList<>();
        DepartmentBuilder departmentBuilder = new DepartmentBuilder();
        Department d1 =(Department) departmentBuilder
                .setDept_num(1)
                .setDept_type("IT대")
                .setDept_phone("054-473-4118")
                .setDept_name("컴퓨터학부")
                .setUniv_address("동작구 상도동 숭실대학교")
                .setUniv_name("숭실대학교")
                .setUniv_phone("02-111-1111")
                .setUniv_num(1)
                .build();

        Department d2 =(Department) departmentBuilder
                .setDept_num(2)
                .setDept_type("IT대")
                .setDept_phone("054-473-4118")
                .setDept_name("글로벌미디어")
                .setUniv_address("동작구 상도동 숭실대학교")
                .setUniv_name("숭실대학교")
                .setUniv_phone("02-111-1111")
                .setUniv_num(1)
                .build();

        Department d3 =(Department) departmentBuilder
                .setDept_num(3)
                .setDept_type("IT대")
                .setDept_phone("054-473-4118")
                .setDept_name("소프트웨어학부")
                .setUniv_address("동작구 상도동 숭실대학교")
                .setUniv_name("숭실대학교")
                .setUniv_phone("02-111-1111")
                .setUniv_num(1)
                .build();

        departmentArrayList.add(d1);
        departmentArrayList.add(d2);
        departmentArrayList.add(d3);

        for(Department d :  departmentArrayList)
        {
            System.out.println(d.toString());
        }


        DepartmentServiceImpl departmentService = new DepartmentServiceImpl();
        departmentService.setDepartmentArrayList(departmentArrayList);
        System.out.println(departmentService.getByDepartmentName("글로벌미디어").toString());

        //대학교

        ArrayList<University> universityArrayList = new ArrayList<>();
        UniversityBuilder universityBuilder =new UniversityBuilder();

        University u1 = universityBuilder.setUniv_address("동작구 상도동 숭실대학교")
                .setUniv_name("숭실대학교")
                .setUniv_phone("02-111-1111")
                .setUniv_num(1)
                .build();
        University u2 = universityBuilder.setUniv_address("동작구 상도동 숭실대학교")
                .setUniv_name("중앙대학교")
                .setUniv_phone("02-111-1111")
                .setUniv_num(2)
                .build();

        University u3 = universityBuilder.setUniv_address("동작구 상도동 숭실대학교")
                .setUniv_name("국민대학교")
                .setUniv_phone("02-111-1111")
                .setUniv_num(3)
                .build();
        universityArrayList.add(u1);
        universityArrayList.add(u2);
        universityArrayList.add(u3);

        for(University u :  universityArrayList){

            System.out.println(u.toString());
        }

        UniversityServiceImpl universityService = new UniversityServiceImpl();
        universityService.setUniversityArrayList(universityArrayList);
        System.out.println(universityService.getBㄱyUniversityName("중앙대학교").toString());







    }
}
