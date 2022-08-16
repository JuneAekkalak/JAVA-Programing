public class CatCafe {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.setBreed("Russian Blue");
		cat1.setAge(2);
		cat1.setColor("gray");
		cat1.setName("Chacha");
		cat1.setWeight(1.5);
		
		Cat cat2 = new Cat();
		cat2.setBreed("Persian Cat");
		cat2.setAge(1);
		cat2.setColor("white");
		cat2.setName("BomBom");
		cat2.setWeight(1.15);
		
		Cat cat3 = new Cat();
		cat3.setBreed("Siamese Cat");
		cat3.setAge(1);
		cat3.setColor("white");
		cat3.setName("PuffPuff");
		cat3.setWeight(1);
		
		int sumAge = cat1.getAge() + cat2.getAge() + cat3.getAge();
		double sumWeight = cat1.getWeight() + cat2.getWeight() + cat3.getWeight();
		System.out.println(""+cat1.toString() +"\n"
		+cat2.toString()+"\n" +cat3.toString() 
		+ "\nAverage age: "+sumAge/3.0 + " Total Weight: " +sumWeight +"kgs");
	}
}
