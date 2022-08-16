import java.util.Scanner;
public class LoopQueenContest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch,yn = 'y' ;
		double f,n,cm,sumCm = 0,max = 0;
		int tall=0 ,i = 0;
		do {
			i = i + 1;
			System.out.print("No. " + i +" Enter height:");
			ch = input.next().charAt(0);
			if(ch == 'f') {
				f = input.nextDouble();
				n = input.nextDouble();
				sumCm = (f *12)+n;
				sumCm = sumCm * 2.54;
			}
			else if(ch == 'c') {
				cm = input.nextDouble();
				sumCm = cm;
			}
			else {
				System.out.println("Error");
			}
			if(sumCm > max) {
				max = sumCm;
				tall = i ;
			}
			System.out.print("Do you want to continue [y/n]:");
			yn = input.next().charAt(0);
		}while(yn == 'y');
		
		System.out.println("No. "+ tall + " is tallest");
		System.out.println("Bye Bye !!!");
	}
}
