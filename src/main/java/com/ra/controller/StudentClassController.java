package com.ra.controller;

import com.ra.model.entity.StudentClass;
import com.ra.service.studentClass.StudentClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/studentClass")
@CrossOrigin("*")
public class StudentClassController {
    @Autowired
    private StudentClassService studentClassService;
    //Hiển thị
    @GetMapping("")
    public ResponseEntity <List<StudentClass>> getAll(){
        List<StudentClass> studentClasses = studentClassService.getAll();
        return new ResponseEntity<>(studentClasses, HttpStatus.OK);
    }
    //Thêm mới
    @PostMapping("")
    public ResponseEntity<StudentClass> save(@RequestBody StudentClass studentClass){
        StudentClass studentClassNew = studentClassService.save(studentClass);
        return new ResponseEntity<>(studentClassNew, HttpStatus.CREATED);
    }
    //tìm kiếm
    @GetMapping("/{id}")
    public ResponseEntity<StudentClass> findById(@PathVariable Long id){
        StudentClass studentClass = studentClassService.findById(id);
        return new ResponseEntity<>(studentClass, HttpStatus.OK);
    }
    //Update
    @PutMapping("/{id}")
    public ResponseEntity<StudentClass> update(@RequestBody StudentClass studentClass){
        StudentClass studentClassUpdate = studentClassService.save(studentClass);
        return new ResponseEntity<>(studentClassUpdate, HttpStatus.OK);
    }
    //Xóa
    @DeleteMapping("/{id}")
    public ResponseEntity<StudentClass> delete(@PathVariable Long id){
        studentClassService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
