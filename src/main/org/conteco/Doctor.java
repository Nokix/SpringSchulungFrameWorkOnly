package org.conteco;

public class Doctor implements Staff {
    private String name;
    private Nurse nurse;

    public Doctor(String name, Nurse nurse) {
        this.name = name;
        this.nurse = nurse;
    }

    @Override
    public void assist() {
        System.out.println("Doctor " + name + " is assisting.");
        nurse.assist();
    }
}
