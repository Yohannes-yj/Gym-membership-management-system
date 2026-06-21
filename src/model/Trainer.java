package model;

public class Trainer extends Person {
    private String specialization;

    public Trainer(int id, String name, int age, String phone, String specialization) {
        super(id, name, age, phone);
        this.specialization = specialization;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}
