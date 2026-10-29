public class Course {
    private String courseCode;
    private String courseName;
    private int credit;
    private Instructor instructor;

    public Course(String courseCode, String courseName, int credit, Instructor instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credit = credit;
        this.instructor = instructor;
    }

    public String getCourseCode() { 
        return courseCode; 
    }

    public String getCourseName() { 
        return courseName; 
    }

    public Instructor getInstructor() { 
        return instructor; 
    }
}