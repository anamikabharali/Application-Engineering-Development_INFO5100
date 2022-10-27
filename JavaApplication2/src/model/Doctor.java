/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anamikabharali
 */
public class Doctor {
    private String DoctorName;
    private int DoctorPh;
    private String Password;
    private String Address;
    private int Community;      //pin code, validation of 5 digs

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public int getDoctorPh() {
        return DoctorPh;
    }

    public void setDoctorPh(int DoctorPh) {
        this.DoctorPh = DoctorPh;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

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
    
    
}