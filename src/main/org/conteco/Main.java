package org.conteco;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("spring.xml");

        Doctor doctor = context.getBean(Doctor.class);
        // Alternativ:
        // Doctor doctor = (Doctor) context.getBean("doctor");

        doctor.assist();

        Nurse nurse = context.getBean(Nurse.class);
        nurse.assist();
    }
}
