/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anamikabharali
 */
public class Person {
    private String Name;
    private int Age;
    private int Ph;
    private String Password;
    private String Address;
    private int Community;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getPh() {
        return Ph;
    }

    public void setPh(int Ph) {
        this.Ph = Ph;
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
