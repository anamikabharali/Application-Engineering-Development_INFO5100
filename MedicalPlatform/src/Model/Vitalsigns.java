/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author anamikabharali
 */
public class Vitalsigns extends Encounter{
    private double Temperature;  //Decimals
    private double BloodPressure;    //Decimals
    private int Pulse;
    //private String Diagnosis;
    //private String Date;

    public double getTemperature() {
        return Temperature;
    }

    public void setTemperature(double Temperature) {
        this.Temperature = Temperature;
    }

    public double getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(double BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public int getPulse() {
        return Pulse;
    }

    public void setPulse(int Pulse) {
        this.Pulse = Pulse;
    }

    //public String getDiagnosis() {
     //   return Diagnosis;
    //}

    //public void setDiagnosis(String Diagnosis) {
    //    this.Diagnosis = Diagnosis;
    //}

    //public String getDate() {
    //    return Date;
    //}

    //public void setDate(String Date) {
     //   this.Date = Date;
    //}
    
}
