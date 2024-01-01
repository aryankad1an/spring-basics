package org.ancient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {

        // defining application context(beans), all the objects are called beans in spring
        // all the beans are defined in spring.xml
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // class based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);


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

        doctor.setQualification("MBBS");
        System.out.println(doctor); // toString override


        Doctor doctor1 = context.getBean(Doctor.class);
//        // we can notice that the same object is created as the scope is singleton
//        // thus we will change scope by @Scope annotation in Doctor class
//        System.out.println(doctor1);

//        fixed it
        System.out.println(doctor1);

        // destroy all {singleton} beans
        ((AnnotationConfigApplicationContext) context).close();
    }
}