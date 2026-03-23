package edu.sdccd.cisc191.repository;

import edu.sdccd.cisc191.model.Course;
import java.util.List;

public class JdbcCourseRepository implements CourseRepository {

    @Override
    public void save(Course course) {
        // TODO use PreparedStatement INSERT
    }

    @Override
    public List<Course> findByStudentId(int studentId) {
        // TODO query courses by student_id and map to List<Course>
        return null;
    }

    @Override
    public List<Course> findAll() {
        // TODO query all rows and map to List<Course>
        return null;
    }
}
