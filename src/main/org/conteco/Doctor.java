package org.conteco;

public class Doctor implements Staff {
    private String name;
    private Nurse nurse;

    @Override
    public void assist() {
        System.out.println("Doctor " + name + " is assisting.");
        nurse.assist();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
}
