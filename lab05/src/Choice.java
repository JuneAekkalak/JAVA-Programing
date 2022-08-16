import java.util.Scanner;
public class Choice {

	public static void main(String[] args) {
		final int ROW = 8 , COL = 10 ; 
		int[][] ans = new int[ROW][COL];
		int[] key = {4 , 2 , 4 ,3 , 3 , 4 , 1 ,5 , 1 , 4};
		int[] Score = new int[ROW] ;
		Scanner input = new Scanner(System.in);

		for(int i = 0 ; i < ans.length ; i++) {
			int sum = 0 ;
			System.out.printf("Enter Answer of student No. %d: ",i+1);
			for(int j = 0 ; j < ans[0].length ; j++) {
				ans[i][j] = input.nextInt();
				if(ans[i][j] == key[j]) {
					sum+=1;
				}
			}
			Score[i] = sum ;
		}
		for(int i = 0 ; i < Score.length ; i++) {
			System.out.printf("Student No.%d is %d \n",i+1 , Score[i]);
		}
	}
}
