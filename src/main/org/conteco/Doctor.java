package org.conteco;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff {
    private String name;
    private Staff staff;

    public Doctor(@Value("Franz") String name, @Qualifier("firstChoice") Staff staff) {
        this.name = name;
        this.staff = staff;
    }

    @Override
    public void assist() {
        System.out.println("Doctor " + name + " is assisting.");
        staff.assist();
    }
}
