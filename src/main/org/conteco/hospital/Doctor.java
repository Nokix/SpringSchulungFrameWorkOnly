package org.conteco.hospital;

import org.conteco.Staff;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "harhar")
//@Scope(value = "prototype")
public class Doctor implements Staff, BeanNameAware {

    private String name;
    private Staff staff;

    public Doctor(@Autowired(required = false) @Qualifier("fullName") String name,
                  @Qualifier("firstChoice") Staff staff) {
        this.name = name;
        this.staff = staff;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void assist() {
        System.out.println("Doctor " + name + " is assisting.");
        staff.assist();
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("This Bean has the name: " + name);
    }

    @PostConstruct
    public void afterConstruction() {
        System.out.println("ich wurde erstellt: " + this);
    }

    @PreDestroy
    public void preDestruction() {
        System.out.println("Bald ist's mit mir vorbei.");
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", staff=" + staff +
                '}';
    }
}
