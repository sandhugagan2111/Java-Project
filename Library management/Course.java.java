class Course {
    private String courseCode;
    private String courseName;

    // Constructor
    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    // Getter methods
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Course Code: " + courseCode + ", Course Name: " + courseName);
    }
}