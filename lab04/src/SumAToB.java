import java.util.Scanner;
public class SumAToB {
	
	public static int sumSeries(int n1, int n2) {
		int sum = 0 , i ;
		for (i = n1 ; i <= n2; i++) {
			if (i % 2 == 0) {
				sum = sum + i ;
			}
		}
		return sum ;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n , i ,n1,n2,sum ; 
		System.out.print("Enter no of loop : ");
		n = input.nextInt();
		
		for (i = 0; i < n ; i++) {
			System.out.print("Start Number : ");
			n1 = input.nextInt();
			System.out.print("End Number : ");
			n2 = input.nextInt();
			sum = sumSeries(n1,n2);
			System.out.println("Summary is " + sum );
		}
	}
}
