package com.ra.service.student;

import com.ra.model.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    Student save(Student student);
    Student findById(Long id);
    void delete(Long id);
}
