class Main {
    public static void main(String[] args) {

        // Create Student objects
        Student s1 = new Student(101, "Riddhi");
        Student s2 = new Student(102, "Gagan");

        // Create Course objects
        Course c1 = new Course("CS101", "Java Programming");
        Course c2 = new Course("CS102", "Database Management");

        // Display Student Details
        System.out.println("=== Students ===");
        s1.displayInfo();
        s2.displayInfo();

        // Display Course Details
        System.out.println("\n=== Courses ===");
        c1.displayInfo();
        c2.displayInfo();

        // Enroll Students into Courses
        System.out.println("\n=== Enrollments ===");
        System.out.println(s1.getName() + " is enrolled in " + c1.getCourseName());
        System.out.println(s2.getName() + " is enrolled in " + c2.getCourseName());
    }
}