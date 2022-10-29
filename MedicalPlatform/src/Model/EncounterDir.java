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
public class EncounterDir {
    
    static ArrayList<Vitalsigns> Encounterdir;
    
    public EncounterDir() {
		EncounterDir.Encounterdir=new ArrayList<Vitalsigns>();
	}
	public ArrayList<Vitalsigns> getList(){
		return Encounterdir;	
	}
        
	public void setList(ArrayList<Vitalsigns>Encounterdir) {
		EncounterDir.Encounterdir=Encounterdir;
        }
        
        public Vitalsigns addnew(){
            Vitalsigns newencounter= new Vitalsigns();
            Encounterdir.add(newencounter);
            return newencounter;
        }
        
        public void deleteList(Vitalsigns newencounter){
            
            Encounterdir.remove(newencounter);}
}
