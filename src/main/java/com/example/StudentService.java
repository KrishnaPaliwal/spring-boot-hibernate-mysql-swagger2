package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public Student getStudentById(Long id) {
        return studentRepository.getStudentById(id);
    }

    public void saveStudent(Student student) {
        studentRepository.saveStudent(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteStudent(id);
    }
}
