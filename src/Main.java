
public class Main {

    public static void main(String[] args) {
        Address address = new Address("Jl. Sudirman", "Surabaya");
        University university = new University("PENS");
        Department department = new Department("Informatics", university);
        Teacher teacher = new Teacher("Dr. Surya", address, "T001", department);
        Student student = new Student("Rizal", address, "S001", department);
        Course course = new Course("OOP", teacher);
        department.addCourse(course);
        Book book = new Book("Introduction to Java", "Dr. Surya");
        Library library = new Library();
        library.addBook(book);

        System.out.println("Student " + student.name + " is studying " + course.name + " at " + university.name);
    }
}
