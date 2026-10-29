public class Main {
    public static void main(String[] args) {
        System.out.println("--- Akıllı Kampüs Ders Programı Başlatılıyor ---");

        // 1. Factory ile Kullanıcı Üretimi
        UserFactory factory = new UserFactory();
        
        User instructor = factory.createUser("INSTRUCTOR", 1, "Ahmet Yılmaz", "ahmet@Kırklareli.edu.tr", "Doç. Dr.");
        instructor.getRoleDetails();

        User student = factory.createUser("STUDENT", 40, "Halime Hilal", "hilal@ogr.Kırklareli.edu.tr", "2");
        student.getRoleDetails();

        // 2. Derslik ve Ders Tanımlama
        Classroom classroom = new Classroom("Lab-1", 40, true);
        Course course = new Course("YAZ201", "Nesneye Yönelik Programlama", 5, (Instructor) instructor);

        // 3. Singleton Testi
        SchedulerManager manager1 = SchedulerManager.getInstance();
        SchedulerManager manager2 = SchedulerManager.getInstance();

        System.out.println("Singleton Testi (Aynı mı?): " + (manager1 == manager2));

        manager1.addClassroom(classroom);
        manager1.addCourse(course);
        manager1.checkConflict("Pazartesi", "09:00", classroom, (Instructor) instructor);

        System.out.println("--- Proje Tasarım Kalıplarıyla Başarıyla Çalıştı! ---");
    }
}