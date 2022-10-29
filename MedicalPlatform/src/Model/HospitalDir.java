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
public class HospitalDir {
    
    static ArrayList<Hospital> Hospitaldir;
    
    public HospitalDir() {
		HospitalDir.Hospitaldir=new ArrayList<Hospital>();
	}
	public ArrayList<Hospital> getList(){
		return Hospitaldir;	
	}
        
	public void setList(ArrayList<Hospital>Hospitaldir) {
		HospitalDir.Hospitaldir=Hospitaldir;
        }
        
        public Hospital addnew(){
            Hospital newhospital= new Hospital();
            Hospitaldir.add(newhospital);
            return newhospital;
        }
        
        public void deleteList(Hospital newhospital){
            Hospitaldir.remove(newhospital);
        }
    
}
