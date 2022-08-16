import java.util.Scanner;
public class MaxMinMean {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int age ,min = 100 , max = 0 , sum = 0 , n;
		double avg ;
		
		System.out.print("Please enter number of people : ");
		n = input.nextInt();
		
		for(int i = 1; i<= n; i++) {
			System.out.print("Age of no. " +i +" :");
			age = input.nextInt();
			if(age > max) {
				max = age;
			}
			if(age < min) {
				min = age;
			}
			sum = sum + age;
		}
		avg = (double)sum / n;
		System.out.println("Maximum : " + max);
		System.out.println("Minimum : " + min);
		System.out.println("Summary : " + sum);
		System.out.println("Average : " + avg);
	}

}
