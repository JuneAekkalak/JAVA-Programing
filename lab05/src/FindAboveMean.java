import java.util.Scanner;
public class FindAboveMean {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch = 'y';
		while(ch == 'y'){
			int n ,count = 0 ;
			double avg ,sum = 0.0;
			System.out.printf("Enter n : ");
			n = input.nextInt();
			
			int[] numBer = new int[n] ;
			System.out.printf("Enter %d numbers : ",n);
			for(int i = 0 ; i < n ; i++) {
				numBer[i] = input.nextInt();
				sum = sum + numBer[i];
			}
			avg = sum/n;
			System.out.printf("Mean : %.2f \n", avg);
			
			int[] aboveMean  = new int[numBer.length];
			for(int i = 0 ; i < numBer.length ; i++) {
				if(avg < numBer[i]) {
					aboveMean[count] = numBer[i];
					count = count + 1 ;
				}
			}
			System.out.printf("No. above mean : %d as: ",count);
			for(int i = 0 ; i < count ; i++) {
				System.out.printf("%d ",aboveMean[i]);
			}
			System.out.printf("\nDo you want to continue [y/n]: ");
			ch = input.next().charAt(0);
		}
		System.out.printf("Bye Bye !!!");
	}
}
