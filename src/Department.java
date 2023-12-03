import java.util.ArrayList;
import java.util.List;


class Department {
    String name;
    University university;
    List<Course> courses = new ArrayList<>();

    Department(String name, University university) {
        this.name = name;
        this.university = university;
    }

    void addCourse(Course course) {
        this.courses.add(course);
    }
}