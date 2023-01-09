package org.conteco.hospital;

import org.conteco.Staff;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("secondChoice")
public class Handyman implements Staff {
    @Override
    public void assist() {
        System.out.println("Handyman ist assisting.");
    }
}
