package org.ancient;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class Nurse implements  Staff{

    public void assist(){
        System.out.println("Nursing. Assisting");
    }

    // this is only called for singleton scope
    @PreDestroy
    public void preDestroy(){
        System.out.println("Nurse destroy method is called");
    }
}
