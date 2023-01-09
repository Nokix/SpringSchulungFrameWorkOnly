package org.conteco;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("firstChoice")
public class Nurse implements Staff{
    @Override
    public void assist() {
        System.out.println("Nurse is assisting.");
    }
}
