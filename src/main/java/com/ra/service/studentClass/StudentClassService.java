package com.ra.service.studentClass;

import com.ra.model.entity.StudentClass;

import java.util.List;

public interface StudentClassService {
    List<StudentClass> getAll();
    StudentClass save(StudentClass studentClass);
    StudentClass findById(Long id);
    void delete(Long id);
}
