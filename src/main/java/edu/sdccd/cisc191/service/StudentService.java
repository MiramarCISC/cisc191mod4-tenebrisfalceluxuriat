package edu.sdccd.cisc191.service;

import edu.sdccd.cisc191.model.Student;
import edu.sdccd.cisc191.repository.StudentRepository;

import java.util.List;

public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public void addStudent(Student student) {
        // TODO delegate to repository
    }

    public Student getStudent(int id) {
        // TODO
        return null;
    }

    public List<Student> getAllStudents() {
        // TODO
        return null;
    }

    public void changeGpa(int id, double newGpa) {
        // TODO
    }

    public void removeStudent(int id) {
        // TODO
    }
}
