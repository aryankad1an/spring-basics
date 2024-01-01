package org.ancient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {

        // defining application context(beans), all the objects are called beans in spring
        // all the beans are defined in spring.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
//        // the value of qualification was injected from spring.xml
//        System.out.println("qualification is " + doctor.getQualification());
//        // value of constructor was injected from spring.xml
//        System.out.println("name is " + doctor.name);
        Nurse nurse = context.getBean(Nurse.class);
        nurse.assist();

        // interfaces
        Staff staff = context.getBean(Doctor.class);
        staff.assist();
    }
}