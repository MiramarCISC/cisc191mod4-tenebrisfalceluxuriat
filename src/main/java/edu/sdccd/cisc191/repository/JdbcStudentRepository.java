package edu.sdccd.cisc191.repository;

import edu.sdccd.cisc191.model.Student;
import java.util.List;

public class JdbcStudentRepository implements StudentRepository {

    @Override
    public void save(Student student) {
        // TODO use PreparedStatement INSERT
    }

    @Override
    public Student findById(int id) {
        // TODO use PreparedStatement SELECT by id
        return null;
    }

    @Override
    public List<Student> findAll() {
        // TODO query all rows and map to List<Student>
        return null;
    }

    @Override
    public void updateGpa(int id, double newGpa) {
        // TODO use PreparedStatement UPDATE
    }

    @Override
    public void deleteById(int id) {
        // TODO use PreparedStatement DELETE
    }
}
