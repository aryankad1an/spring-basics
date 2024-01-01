package org.ancient;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.print.Doc;

// this annotation tells spring that this class is a bean
@Component
@Scope(scopeName = "prototype") // object can be created multiple times
public class Doctor implements Staff, BeanNameAware {
    public void assist(){
        System.out.println("Doctor Object Created and is assisting");
    }
    private String qualification;


    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString(){
        return "Doctor{" + "qualification='" + qualification + '\'' + '}';
    }

    // life cycle of a bean
    @Override
    public void setBeanName(String name) {
        System.out.println("Set BeanName method is called with doctor");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("init method is called");
    }



    // commented to explain annotation beans and class based config
//    private String qualification;
//    public String name;
//
//    public String getQualification() {
//        return qualification;
//    }
//    public void setQualification(String qualification) {
//        this.qualification = qualification;
//    }
//
//    private Nurse nurse;
//    public Nurse getNurse() {
//        return nurse;
//    }
//
//    public void setNurse(Nurse nurse) {
//        this.nurse = nurse;
//    }
//
//
//
//    public Doctor(String name){
//        this.name = name;
//    }
}
