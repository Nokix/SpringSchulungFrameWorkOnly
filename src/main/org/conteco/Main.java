package org.conteco;

public class Main {
    public static void main(String[] args) {
        Qualification qualification = new Qualification("PHD");
        Doctor doctor = new Doctor(qualification);
        doctor.assist();
    }
}
