package com.example.studentapi;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudent(int id) {
        return repository.findById(id).orElse(null);
    }

    public Student addStudent(Student student) {
        return repository.save(student);
    }

    public Student updateStudent(int id, Student student) {
        student.setId(id);
        return repository.save(student);
    }

    public void deleteStudent(int id) {
        repository.deleteById(id);
    }
}
