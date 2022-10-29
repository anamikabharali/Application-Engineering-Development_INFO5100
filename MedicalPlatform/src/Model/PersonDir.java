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
public class PersonDir {
    
    static ArrayList<Person> Persondir;
    
    public PersonDir() {
		PersonDir.Persondir=new ArrayList<Person>();
	}
	public ArrayList<Person> getList(){
		return Persondir;	
	}
        
	public void setList(ArrayList<Person>Persondir) {
		PersonDir.Persondir=Persondir;
        }
        
        public Person addnew(){
            Person newPerson= new Person();
            Persondir.add(newPerson);
            return newPerson;
        }
        
        public void deleteList(Person newPerson){
            Persondir.remove(newPerson);
        }
    
}
