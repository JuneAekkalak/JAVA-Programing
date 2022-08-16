package lab09;
import java.util.ArrayList;
public class PersonDemoArrayList {
	public static void displayAllPerson(ArrayList <Person> o) {
		int s = 0 , e = 0 ,sumAgeS = 0,sumAgeE = 0 ,sumSalary = 0;
		for(int i = 0 ; i < o.size();i++) {
			if(o.get(i) instanceof Student) s+=1;
			if(o.get(i) instanceof Employee) e+=1;
		}
		System.out.println("No. of  Student = " + s);
		for(int i = 0 ; i < o.size() ; i++ ) {
			if(o.get(i) instanceof Student) {
				System.out.println(""+((Student) o.get(i)).toString());
				sumAgeS += ((Student) o.get(i)).getAge();
			}
		}
		System.out.println("Average Age of Student =  "+sumAgeS/s);
		System.out.println("================================");
		System.out.println("No. of  Employee = " + e);
		for(int i = 0 ; i < o.size() ; i++ ) {
			if(o.get(i) instanceof Employee) {
				System.out.println(""+((Employee) o.get(i)).toString());
				sumAgeE += ((Employee) o.get(i)).getAge();
				sumSalary += ((Employee) o.get(i)).salary;
			}
		}
		System.out.println("Average Age of Emproyee =  " + sumAgeE/e + " ,Average Salary = " + sumSalary/e);
		System.out.println("================================");
		System.out.println("Average Age of " + o.size() +" Person =  "+calAverageAge(o));
	}
	public static double calAverageAge(ArrayList <Person> o) {
		int sumAge = 0 ;
		for(int i = 0 ; i < o.size() ; i++ ) {
			sumAge += o.get(i).getAge();
		}
		return sumAge/o.size();
	}
	public static void main(String[] args) {
		ArrayList <Person> person = new ArrayList <Person> ();
		person.add(new Student ("AAA BBB",1998 ,"63113013","SWE"));
		person.add(new Student ("BBB AAA",1998 ,"61022211","COE"));
		person.add(new Student ("CCC DDD",1999 ,"60124578","SWE"));
		person.add(new Employee ("KKK YYY",1996 ,true,25000));
		person.add(new Employee ("QQQ UUU",1995 ,false,50000));
		person.add(new Employee ("LLL PPP",1999 ,false,15000));
		displayAllPerson(person);
	}
}
