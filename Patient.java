public class Patient {
    //Atributos
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;
    
    Patient(String name, String email) {
        this.name = name;
        this.email = email;
        System.out.println("Patient name " + name + " Patient email " + email);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String setWeight() {
        return "Weight: " + weight + " kg.";
    }
    
    public void setHeight(double height) {
        this.height = height;
    }

    public String setHeight() {
        return "Height: " + height + " m.";
    }
    
    public void setphoneNumber(String phoneNumber) {
        if (phoneNumber.length() < 8) {
            System.out.println("Please enter a valid phone number");
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getphoneNumber() {
        return "Phone number: " + phoneNumber;
    }
}
