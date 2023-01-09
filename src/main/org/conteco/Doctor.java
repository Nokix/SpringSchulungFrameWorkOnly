package org.conteco;

public class Doctor implements Staff{

    @Override
    public void assist() {
        System.out.println("Doctor is assisting.");
    }
}
