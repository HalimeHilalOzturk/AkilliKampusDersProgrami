public class UserFactory {
    public User createUser(String type, int id, String name, String email, String extraInfo) {
        if (type.equalsIgnoreCase("STUDENT")) {
            int grade = Integer.parseInt(extraInfo);
            return new Student(id, name, email, grade);
        } else if (type.equalsIgnoreCase("INSTRUCTOR")) {
            return new Instructor(id, name, email, extraInfo);
        }
        return null;
    }
}