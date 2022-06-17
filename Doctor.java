public class Doctor {
    static int id;//Autoincrement
    String name;
    String email;
    String speciality;

    Doctor() {
        System.out.println("Doctor created");
    }

    Doctor(String name, String speciality) {
        System.out.println("Doctor name " + name + " Speciality " + speciality);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName() {
        System.out.println("Nombre del Doctor " + name);
    }
    public void showId() {
        System.out.println("Id del Doctor " + id);
    }
}
