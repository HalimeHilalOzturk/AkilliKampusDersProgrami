import java.util.ArrayList;
import java.util.List;

public class SchedulerManager {
    private static SchedulerManager instance;
    
    private List<Classroom> classrooms = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    // Constructor private
    private SchedulerManager() {}

    public static SchedulerManager getInstance() {
        if (instance == null) {
            instance = new SchedulerManager();
        }
        return instance;
    }

    public void addClassroom(Classroom classroom) {
        classrooms.add(classroom);
        System.out.println("Derslik eklendi: " + classroom.getRoomName());
    }

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Ders eklendi: " + course.getCourseName());
    }

    public boolean checkConflict(String day, String timeSlot, Classroom room, Instructor instructor) {
        System.out.println(day + " " + timeSlot + " için " + room.getRoomName() + " ve " + instructor.getTitle() + " " + instructor.name + " kontrol ediliyor...");
        return false;
    }
}