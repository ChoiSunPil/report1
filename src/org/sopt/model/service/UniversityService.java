package org.sopt.model.service;

import org.sopt.model.University;

public interface UniversityService {

    University getByUniversityName(final String name);
}
