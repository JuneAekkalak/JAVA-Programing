import java.util.Scanner;
public class MethodLoopQueenContest {
	
	public static double Foot2Cm(int foot,int inch) {
		double Cm ;
		Cm = (foot *12)+inch;
		Cm = Cm * 2.54;
		return Cm ;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch,yn = 'y' ;
		double sumCm = 0,max = 0;
		int tall=0 ,i = 0,f,n,cm;
		do {
			i = i + 1;
			System.out.print("No. " + i +" Enter height:");
			ch = input.next().charAt(0);
			if(ch == 'f') {
				f = input.nextInt();
				n = input.nextInt();
				sumCm = Foot2Cm(f,n);
			}
			else if(ch == 'c') {
				cm = input.nextInt();
				sumCm = cm;
			}
			else {
				System.out.println("Error");
			}
			if(sumCm > max) {
				max = sumCm;
				tall = i ;
			}
			System.out.println("No."+ i + "  is " + sumCm + "cm." );
			System.out.print("Do you want to continue [y/n]:");
			yn = input.next().charAt(0);
		}while(yn == 'y');
		System.out.println("No. "+ tall + " is tallest");
		System.out.println("Bye Bye !!!");
	}
}
