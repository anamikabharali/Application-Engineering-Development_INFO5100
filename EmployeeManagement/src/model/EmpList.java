/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author anamikabharali
 */
public class EmpList {
    private ArrayList<EmpProfile> history;
	public EmpList() {
		this.history=new ArrayList<EmpProfile>();
	}
	public ArrayList<EmpProfile> getList(){
		return history;
		
	}
	public void setList(ArrayList<EmpProfile>history) {
		this.history=history;}
        public EmpProfile addnew(){
            EmpProfile newemp= new EmpProfile();
            history.add(newemp);
            return newemp;
        }
}
