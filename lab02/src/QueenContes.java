import java.util.Scanner;
public class QueenContes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch ;
		double f,n,cm;
		double sumCm1 = 0,sumCm2 = 0;
		System.out.print("No. 1 Enter height: ");
		ch = input.next().charAt(0);
		if(ch == 'f') {
			f = input.nextDouble();
			n = input.nextDouble();
			sumCm1 = (f *12)+n;
			sumCm1 = sumCm1 * 2.54;
		}
		if(ch == 'c') {
			cm = input.nextDouble();
			sumCm1 = cm;
		}
		
		System.out.print("No. 2 Enter height: ");
		ch = input.next().charAt(0);
		if(ch == 'f') {
			f = input.nextDouble();
			n = input.nextDouble();
			sumCm2 = (f *12)+n;
			sumCm2 = sumCm2 * 2.54;
		}
		if(ch == 'c') {
			cm = input.nextDouble();
			sumCm2 = cm;
		}
		
		System.out.println("No. 1 is "+ sumCm1 + "cm. and No. 2 is " + sumCm2 + " cm.");
		if(sumCm1 > sumCm2) {
			System.out.println("No.1 is taller. ");
		}
		else {
			System.out.println("No.2 is taller. ");
		}
	}
}
