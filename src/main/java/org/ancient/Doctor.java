package org.ancient;

import javax.print.Doc;

public class Doctor implements Staff{
    private String qualification;
    public String name;

    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    private Nurse nurse;
    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }


    public void assist(){
        System.out.println("Assisting");
    }

    public Doctor(String name){
        this.name = name;
    }
}
