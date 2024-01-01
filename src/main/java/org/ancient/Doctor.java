package org.ancient;

import org.springframework.stereotype.Component;

import javax.print.Doc;

// this annotation tells spring that this class is a bean
@Component
public class Doctor implements Staff{
    public void assist(){
        System.out.println("Assisting");
    }

    // comment to explain annotation beans
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
