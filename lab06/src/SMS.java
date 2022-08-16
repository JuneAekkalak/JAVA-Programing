public class SMS {
	private String number ;
	public SMS(String number) {
		this.number = number;
	}
	public void readAs() {
		String[] splitWord = this.number.split("");
		String word = "";
		String sumWord = "";
		for(int i = 0 ; i < number.length() ; i++) {
			if(Integer.parseInt(splitWord[i]) == 1) word += "One ";
			else if(Integer.parseInt(splitWord[i]) == 2) word += "Two ";
			else if(Integer.parseInt(splitWord[i])== 3) word += "Three ";
			else if(Integer.parseInt(splitWord[i]) == 4) word += "Four ";
			else if(Integer.parseInt(splitWord[i]) == 5) word += "Five ";
			else if(Integer.parseInt(splitWord[i]) == 6) word += "Six ";
			else if(Integer.parseInt(splitWord[i]) == 7) word += "Saven ";
			else if(Integer.parseInt(splitWord[i]) == 8) word += "Eight ";
			else if(Integer.parseInt(splitWord[i]) == 9) word += "Nine ";
			else word += "Zero ";
		}
		sumWord += word;
		System.out.println("Read as : "+ sumWord );
	}
}
