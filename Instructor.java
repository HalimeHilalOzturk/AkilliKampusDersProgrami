public class Instructor extends User {
    private String title; // Unvan (Prof. Dr., Doç. Dr., Dr. Öğr. Üyesi vb.)

    public Instructor(int id, String name, String email, String title) {
        super(id, name, email);
        this.title = title;
    }

    @Override
    public void getRoleDetails() {
        System.out.println("Öğretim Elemanı: " + title + " " + name);
    }

    public String getTitle() { 
        return title; 
    }
}