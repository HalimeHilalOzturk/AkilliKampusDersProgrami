public class Student extends User {
    private int gradeLevel;

    public Student(int id, String name, String email, int gradeLevel) {
        super(id, name, email);
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void getRoleDetails() {
        System.out.println("Öğrenci: " + name + ", Sınıf Seviyesi: " + gradeLevel);
    }
}