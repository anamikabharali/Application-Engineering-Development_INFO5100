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
public class DoctorDir {
    
    static ArrayList<Doctor> Doctordir;
    
    public DoctorDir() {
		DoctorDir.Doctordir=new ArrayList<Doctor>();
	}
	public ArrayList<Doctor> getList(){
		return Doctordir;	
	}
        
	public void setList(ArrayList<Doctor>Doctordir) {
		DoctorDir.Doctordir=Doctordir;
        }
        
        public Doctor addnew(){
            Doctor newdoctor= new Doctor();
            Doctordir.add(newdoctor);
            return newdoctor;
        }
        
        public void deleteList(Doctor newdoctor){
            
            Doctordir.remove(newdoctor);
        }
        
}
