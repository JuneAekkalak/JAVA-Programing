
public class SMS {
	private String number ;
	public SMS(String number) {
		this.number = number;
	}
	public String getNumber() {
		return this.number ;
	}
	public static int[] Digit = new int[10];
	public void readAs() {
		String[] splitWord = this.number.split("");
		String word = "";
		String sumWord = "";
		for(int i = 0 ; i < number.length() ; i++) {
			if(Integer.parseInt(splitWord[i]) == 1) {word += "One "; Digit[1]++;}
			else if(Integer.parseInt(splitWord[i]) == 2) { word += "Two ";Digit[2]++;}
			else if(Integer.parseInt(splitWord[i])== 3) {word += "Three ";Digit[3]++;}
			else if(Integer.parseInt(splitWord[i]) == 4) {word += "Four ";Digit[4]++;}
			else if(Integer.parseInt(splitWord[i]) == 5) { word += "Five ";Digit[5]++;}
			else if(Integer.parseInt(splitWord[i]) == 6) {word += "Six ";Digit[6]++;}
			else if(Integer.parseInt(splitWord[i]) == 7) { word += "Saven ";Digit[7]++;}
			else if(Integer.parseInt(splitWord[i]) == 8) { word += "Eight ";Digit[8]++;}
			else if(Integer.parseInt(splitWord[i]) == 9) {word += "Nine ";Digit[9]++;}
			else {word += "Zero ";Digit[0]++;}
		}
		sumWord += word;
		System.out.println("Read as : "+ sumWord );
	}
	public static void printDigit() {
		String[] number = {"Zero","One" ,"Two", "Three" ,"Four" ,"Five" ,"Six" ,"Seven" ,"Eight" , "Nin"};
		System.out.println("Digit Summary ");
		for(int i = 0; i < Digit.length ; i++ ) {
			if(Digit[i] != 0) {
				System.out.print(number[i] + " : ");
				for(int j = 0 ; j < Digit[i] ; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			else continue ;
		}
	}
}
