import java.util.ArrayList;
public class Bank {
	 private String name;
     private ArrayList<Employees > employee ;
     
	 Bank(String name ,ArrayList<Employees > employee ){
	     this.name = name;
	     this.employee = employee; 
	 }
	     
	 public String getBankName(){
	    return this.name;
	 }
	 public ArrayList<Employees >  getEmployee(){
		 return this.employee ;
	 }
}
