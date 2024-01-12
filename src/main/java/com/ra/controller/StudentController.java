package com.ra.controller;

import com.ra.model.entity.Student;
import com.ra.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("")
    public ResponseEntity<List<Student>> getAll(){
        List<Student> students = studentService.getAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<Student> save(@RequestBody Student student){
        Student students = studentService.save(student);
        return new ResponseEntity<>(students, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> findById(@PathVariable Long id){
        Student student = studentService.findById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@RequestBody Student student){
        Student studentUpdate = studentService.save(student);
        return new ResponseEntity<>(studentUpdate, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Student> delete(@PathVariable Long id){
        studentService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
