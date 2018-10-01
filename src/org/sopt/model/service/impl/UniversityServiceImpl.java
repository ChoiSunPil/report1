package org.sopt.model.service.impl;

import org.sopt.model.University;
import org.sopt.model.builder.UniversityBuilder;
import org.sopt.model.service.UniversityService;

import java.util.ArrayList;

public class UniversityServiceImpl implements UniversityService {

    ArrayList<University> universityArrayList;
    public void setUniversityArrayList(ArrayList<University> list)
    {
        universityArrayList = list;
    }
    @Override
    public University getByUniversityName(String name) {
        for(University university:universityArrayList)
        {
            if(university.getUniv_name() == name)
            {
                UniversityBuilder universityBuilder = new UniversityBuilder();
                University copy = universityBuilder
                        .setUniv_address(university.getUniv_address())
                        .setUniv_phone(university.getUniv_phone())
                        .setUniv_num(university.getUniv_num())
                        .setUniv_name(university.getUniv_name())
                        .build();

                return copy;
            }





        }



        return null;
    }
}
