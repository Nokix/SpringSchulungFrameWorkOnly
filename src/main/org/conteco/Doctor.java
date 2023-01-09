package org.conteco;

public class Doctor {
    private Qualification qualification;

    public Doctor(Qualification qualification) {
        this.qualification = qualification;
    }

    public void assist() {
        System.out.println("Doctor with qualification "
                + qualification.getQualification() + " is assisting.");
    }
}
