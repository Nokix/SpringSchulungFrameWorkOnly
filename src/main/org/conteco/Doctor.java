package org.conteco;

public class Doctor {
    private Qualification qualification;

    public Doctor() {
        qualification = new Qualification("PHD");
    }

    public void assist() {
        System.out.println("Doctor with Qualification "
                + qualification.getQualification() + " is assisting.");
    }
}
