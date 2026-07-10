package com.example.student_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ArrayList<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @PostMapping
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @PutMapping("/{id}")
    public boolean updateStudent(@PathVariable int id,
                                 @RequestBody Student updatedStudent) {

        return studentService.updateStudent(id, updatedStudent);
    }

    @DeleteMapping("/{id}")
    public boolean deleteStudent(@PathVariable int id) {
        return studentService.deleteStudent(id);
    }
}