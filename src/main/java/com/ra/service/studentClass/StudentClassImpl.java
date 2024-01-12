package com.ra.service.studentClass;

import com.ra.model.entity.StudentClass;
import com.ra.repository.StudentClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentClassImpl implements StudentClassService{
    @Autowired
    private StudentClassRepository studentClassRepository;
    @Override
    public List<StudentClass> getAll() {
        return studentClassRepository.findAll();
    }

    @Override
    public StudentClass save(StudentClass studentClass) {
        return studentClassRepository.save(studentClass);
    }

    @Override
    public StudentClass findById(Long id) {
        return studentClassRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        studentClassRepository.deleteById(id);
    }
}
