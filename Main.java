import static cal.Calculator.*;

import static ui.UIMenu.*;
public class Main {

    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Jonathan", "Cirujano");
        System.out.println("Doctor name " + doctor1.name + " Doctor speciality " + doctor1.speciality);
        Patient patient1 = new Patient("Romulo", "magno@gmail.com");
        patient1.setWeight(70);
        System.out.println(patient1.setWeight());
        patient1.setHeight(1.70);
        System.out.println(patient1.setHeight());
        patient1.setphoneNumber("1234567");
        System.out.println(patient1.getphoneNumber());
        //showMenu();
    }
}