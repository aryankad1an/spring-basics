package org.ancient;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.print.Doc;

// this annotation tells spring that this class is a bean
@Component
@Scope(scopeName = "prototype") // object can be created multiple times
public class Doctor implements Staff{
    public void assist(){
        System.out.println("Assisting");
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
