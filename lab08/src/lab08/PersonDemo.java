package lab08;
public class PersonDemo {
	public static void displayAllPerson(Person[] o) {
		for(int i = 0 ; i < o.length ; i++ ) {
			System.out.print(""+o[i].toString());
			System.out.println("");
		}
	}
	public static int calAverageAge(Person[] o) {
		int sumAge = 0 ;
		for(int i = 0 ; i < o.length ; i++ ) {
			sumAge += o[i].getAge();
		}
		return sumAge/o.length;
	}
	public static void main(String[] args) {
		String[] name = {"AAA BBB" , "BBB AAA" , "CCC DDD"};
		int[] birth = {1998 , 1998 , 1999};
		String[] sid = {"63113013","61022211","60124578"};
		String[] major = {"SWE" , "ITD" , "SWE"};
		
		String[] Ename = {"KKK YYY" , "QQQ UUU" , "LLL PPP"};
		int[] Ebirth = {1996 , 2000 , 2001};
		boolean[] status = {true , false , false};
		int[] salary = {25000 , 50000 , 15000};
		
		Person[] studen = new Student[3];
		Person[] emplo = new Employee[3];
		int sumAge = 0;
		double sumSalary = 0;
		for(int i = 0 ,j=0; i < studen.length ; i++,j++) {
			studen[i] = new Student(name[i] , birth[i] , sid[i] ,major[i]);
			emplo[j] = new Employee(Ename[i] , Ebirth[i] ,status[i] , salary[i]);
			sumAge += studen[i].getAge() + emplo[i].getAge() ;
			sumSalary += salary[i];
		}
		System.out.println("No. of  Student = " + studen.length);
		displayAllPerson(studen);
		System.out.println("Average Age of Student = "+calAverageAge(studen));
		System.out.println("================================");
		System.out.println("No. of  Employee = " + emplo.length);
		displayAllPerson(emplo);
		System.out.println("Average Age of Employee = "
				+calAverageAge(emplo)+", Average Salary = "+sumSalary/emplo.length);
		System.out.println("================================");
		System.out.println("Average Age of "+(studen.length+emplo.length)+" Person = "
				+sumAge/(studen.length+emplo.length));
	}
}
