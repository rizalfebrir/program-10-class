import java.util.ArrayList;
import java.util.List;

class University {
    String name;
    List<Department> departments = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Department department) {
        this.departments.add(department);
    }
}