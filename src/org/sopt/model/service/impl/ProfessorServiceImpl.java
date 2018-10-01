package org.sopt.model.service.impl;

import org.sopt.model.Professor;
import org.sopt.model.builder.ProfessorBuilder;
import org.sopt.model.service.ProfessorService;

import java.util.ArrayList;

public class ProfessorServiceImpl implements ProfessorService {

    private  ArrayList<Professor> professorArrayList;
    public void setList(ArrayList<Professor> list) {
        professorArrayList  = list;
    }

    @Override
    public Professor getByProfessorNum(int num) {

        for(Professor professor : professorArrayList)
        {
            if(professor.getPro_num() == num)
            {
                ProfessorBuilder professorBuilder = new ProfessorBuilder();
                Professor copy;
                copy = (Professor) professorBuilder
                        .setPro_major(professor.getPro_major())
                        .setPro_name(professor.getPro_name())
                        .setPro_num(professor.getPro_num())
                        .setPro_phone(professor.getPro_phone())
                        .setPro_subject(professor.getPro_subject())
                        .setDept_name(professor.getDept_name())
                        .setDept_num(professor.getDept_num())
                        .setDept_phone(professor.getDept_phone())
                        .setDept_type(professor.getDept_type())
                        .setUniv_address(professor.getUniv_address())
                        .setUniv_name(professor.getUniv_name())
                        .setUniv_num(professor.getUniv_num())
                        .setUniv_phone(professor.getUniv_phone())
                        .build();
                return copy;
            }
        }
        return null;
    }
}
