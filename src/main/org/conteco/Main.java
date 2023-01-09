package org.conteco;

import org.conteco.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = context.getBean(Doctor.class);
        System.out.println(doctor.getName());
        doctor.setName("Sven Svenson");
        System.out.println(doctor.getName());

        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1.getName());

        context.close();

    }
}
