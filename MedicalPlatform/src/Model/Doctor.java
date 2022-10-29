/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author anamikabharali
 */
public class Doctor extends Person{
    private String hospitalname;
    private boolean isdoctor;

    public boolean Isdoctor() {
        return isdoctor;
    }

    public void setIsdoctor(boolean isdoctor) {
        this.isdoctor = isdoctor;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }
    
    
}
