class Teacher extends Person {
    String id;
    Department department;

    Teacher(String name, Address address, String id, Department department) {
        super(name, address);
        this.id = id;
        this.department = department;
    }
}