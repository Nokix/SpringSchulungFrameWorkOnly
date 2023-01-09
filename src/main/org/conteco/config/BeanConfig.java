package org.conteco.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.conteco")
public class BeanConfig {

    @Bean
    @Qualifier("fullName")
    public String firstName() {
        return "Karl";
    }

    @Bean
    @Qualifier("fullName")
    public String lastName() {
        return "Karlson";
    }

    @Bean
    public String fullName(String firstName,
                           String lastName) {
        return firstName + " " + lastName;
    }
}
