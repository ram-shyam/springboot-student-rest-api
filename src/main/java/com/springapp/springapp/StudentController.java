package com.springapp.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Create a new student
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    // Get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // Get a student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    // Update a student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student studentDetails) {
        return studentService.updateStudent(id, studentDetails);
    }

    // Delete a student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return "Student with ID " + id + " deleted.";
    }
}
