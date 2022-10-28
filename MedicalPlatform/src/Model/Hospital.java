/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author anamikabharali
 */
public class Hospital {
    private String hospitalname;
    private int hospitalph;
    private String password;
    private String hospitaladdress;
    private int communitycode;

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }

    public int getHospitalph() {
        return hospitalph;
    }

    public void setHospitalph(int hospitalph) {
        this.hospitalph = hospitalph;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHospitaladdress() {
        return hospitaladdress;
    }

    public void setHospitaladdress(String hospitaladdress) {
        this.hospitaladdress = hospitaladdress;
    }

    public int getCommunitycode() {
        return communitycode;
    }

    public void setCommunitycode(int communitycode) {
        this.communitycode = communitycode;
    }
    
}
