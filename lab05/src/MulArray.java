public class MulArray {

	public static void printArray(int[] arr) {
		System.out.printf("Element of ArrC : " );
		for(int i = 0 ; i<arr.length;i++) {
			System.out.printf(" %d ",arr[i]);
		}
		System.out.println();
	}
	public static int[] mulArray(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length];
		for( int i = 0 ; i < arr1.length ; i++) {
			for(int j = 9 ; j >= 9-i  ; j--) {
				arr3[i] = arr1[i] * arr2[j];
			}
		}
		return arr3 ;
	}
	public static void main(String[] args) {
		int[] Arr1 = {7,3,5,6,9,8,11,4,1,6};
		int[] Arr2 = {9,8,11,4,1,6,7,3,5,2};
		int[] ArrC = new int[Arr1.length];
		ArrC = mulArray(Arr1 , Arr2);
		printArray(ArrC);
		int sum = 0;
		for(int i = 0 ; i < ArrC.length ; i++){
			sum += ArrC[i];
			if(i == ArrC.length - 1) {
				System.out.printf("%d ", ArrC[i]);
			}else
				System.out.printf("%d + ", ArrC[i]);
		}
		System.out.printf("\nSum of ArrC is : %d", sum );
	}
}
