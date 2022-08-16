import java.util.Scanner;
public class DisplayTemp {
	public static int maxPosTemp(int[] arr) {
		int max = 0 ,point = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > point) {
				point = arr[i] ; 
				max = i;
			}
		}
		return max ; 
	}
	public static int minPosTemp(int[] arr) {
		int min = 0 ,point = 100;; 
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] < point) {
				point = arr[i]; 
				min = i;
			}
		}
		return min ; 
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int SIZE =  12 ;
		int max , min  ;
		int[] A = new int[SIZE];
		String[] month = {"January" , "February", "March" , "April" , "May" , "June" ,
				"July" , "August" , "September" , "October" , "November" , "December"};
		for(int i = 0 ; i < A.length ; i++) {
			System.out.printf("Please enter temp of %s : ",month[i]);
			A[i] = input.nextInt();
		}
		max = maxPosTemp(A);
		min = minPosTemp(A);
		System.out.printf("Maximum temp is %d and %d is a temp of %s \n", A[max] ,A[max] , month[max]);
		System.out.printf("Mininum temp is %d and %d is a temp of %s \n", A[min] ,A[min] , month[min]);
	}
}
