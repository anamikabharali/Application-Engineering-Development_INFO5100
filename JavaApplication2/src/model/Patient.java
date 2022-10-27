/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anamikabharali
 */
public class Patient {
    
    private String PatientName;
    private int PatientAge;
    private int PatientPh;
    private String Password;
    private String Address;
    private int Community;      //pin code, validation of 5 digs

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getCommunity() {
        return Community;
    }

    public void setCommunity(int Community) {
        this.Community = Community;
    }
    

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    public int getPatientAge() {
        return PatientAge;
    }

    public void setPatientAge(int PatientAge) {
        this.PatientAge = PatientAge;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public int getPatientPh() {
        return PatientPh;
    }

    public void setPatientPh(int PatientPh) {
        this.PatientPh = PatientPh;
    }
    
}
