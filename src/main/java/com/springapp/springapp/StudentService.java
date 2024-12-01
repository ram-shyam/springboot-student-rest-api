package com.springapp.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Save a student
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get student by ID
    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    // Update student
    public Student updateStudent(int id, Student studentDetails) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            student.setName(studentDetails.getName());
            student.setMarks(studentDetails.getMarks());
            return studentRepository.save(student);
        }
        return null;
    }

    // Delete student
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
