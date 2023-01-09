package org.conteco;

import org.conteco.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = context.getBean(Doctor.class);
        // Alternativ:
        // Doctor doctor = (Doctor) context.getBean("doctor");

        doctor.assist();

//        Nurse nurse = context.getBean(Nurse.class);
//        nurse.assist();
    }
}
