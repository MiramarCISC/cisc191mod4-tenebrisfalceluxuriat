package edu.sdccd.cisc191;

import edu.sdccd.cisc191.model.Course;
import edu.sdccd.cisc191.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Module4JdbcTests {

    @Test
    void studentRejectsInvalidId() {
        assertThrows(IllegalArgumentException.class, () -> new Student(0, "Alice", 3.5));
    }

    @Test
    void studentRejectsBlankName() {
        assertThrows(IllegalArgumentException.class, () -> new Student(1, "   ", 3.5));
    }

    @Test
    void studentRejectsInvalidGpa() {
        assertThrows(IllegalArgumentException.class, () -> new Student(1, "Alice", 4.5));
    }

    @Test
    void studentStoresValidValues() {
        Student s = new Student(1, "Alice", 3.5);
        assertEquals(1, s.getId());
        assertEquals("Alice", s.getName());
        assertEquals(3.5, s.getGpa(), 0.0001);
    }

    @Test
    void courseRejectsInvalidId() {
        assertThrows(IllegalArgumentException.class, () -> new Course(0, "Java", 1));
    }

    @Test
    void courseRejectsBlankTitle() {
        assertThrows(IllegalArgumentException.class, () -> new Course(1, "   ", 1));
    }

    @Test
    void courseRejectsInvalidStudentId() {
        assertThrows(IllegalArgumentException.class, () -> new Course(1, "Java", 0));
    }

    @Test
    void courseStoresRelationshipFields() {
        Course c = new Course(1, "Java", 42);
        assertEquals(1, c.getId());
        assertEquals("Java", c.getTitle());
        assertEquals(42, c.getStudentId());
    }
}
