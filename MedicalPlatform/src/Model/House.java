/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author anamikabharali
 */
public class House {
    
    private int residentphno;
    private String residentname;
    private String houseaddress;
    private String housecity;
    private int housepincodecode;

    public String getHouseaddress() {
        return houseaddress;
    }

    public void setHouseaddress(String houseaddress) {
        this.houseaddress = houseaddress;
    }

    public String getHousecity() {
        return housecity;
    }

    public void setHousecity(String housecity) {
        this.housecity = housecity;
    }

    public int getHousepincodecode() {
        return housepincodecode;
    }

    public void setHousepincodecode(int housepincodecode) {
        this.housepincodecode = housepincodecode;
    }
    
    public int getResidentphno() {
        return residentphno;
    }

    public void setResidentphno(int residentphno) {
        this.residentphno = residentphno;
    }

    public String getResidentname() {
        return residentname;
    }

    public void setResidentname(String residentname) {
        this.residentname = residentname;
    }
    
}
