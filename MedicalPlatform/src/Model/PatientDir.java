/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author anamikabharali
 */
public class PatientDir {
    
    static ArrayList<Patient> Patientdir;
    
    public PatientDir() {
		PatientDir.Patientdir=new ArrayList<Patient>();
	}
	public ArrayList<Patient> getList(){
		return Patientdir;	
	}
        
	public void setList(ArrayList<Patient>Patientdir) {
		PatientDir.Patientdir=Patientdir;
        }
        
        public Patient addnew(){
            Patient newPatient= new Patient();
            Patientdir.add(newPatient);
            return newPatient;
        }
        
        public void deleteList(Patient newPatient){
            Patientdir.remove(newPatient);
        }
    
}
