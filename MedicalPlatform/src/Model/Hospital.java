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
    private String hospitaladdress;
    private String hospitalcity;
    private int hospitalpincode;

    public String getHospitalname() {
        return hospitalname;
    }

    public String getHospitalcity() {
        return hospitalcity;
    }

    public void setHospitalcity(String hospitalcity) {
        this.hospitalcity = hospitalcity;
    }

    public int getHospitalpincode() {
        return hospitalpincode;
    }

    public void setHospitalpincode(int hospitalpincode) {
        this.hospitalpincode = hospitalpincode;
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

    public String getHospitaladdress() {
        return hospitaladdress;
    }

    public void setHospitaladdress(String hospitaladdress) {
        this.hospitaladdress = hospitaladdress;
    }

}
