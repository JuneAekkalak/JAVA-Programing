package lab11;
import java.util.ArrayList;
public class Project {
	private ArrayList<Member> members ;
	private int numMember ;
	private int maxMember ;
	private String projectName = "OS Team";
	public Project(int n, int maxNum) {
		this.numMember = n ;
		this.maxMember = maxNum ;
	}
	public void addMember(ArrayList<Member> member) {
		this.members = member;
	}
	public void addMember(Member member) {
		if(this.numMember >= this.maxMember) {
			System.out.println("OvermaxMember can not add");
		}
		else
			this.members.add(member);
	}
	public void deleteMember(Member member) {
		if(this.numMember > 0 ) {
			this.members.remove(member);
			this.numMember-- ;
		}
		else System.out.println("can not deleate");
	}
	public void displayProject() {
		System.out.println("Welcome to Project " +this.projectName );
		System.out.println("Number of members: "+ this.numMember);
		int countCheif = 0 , countdeputy = 0 , countsecretary = 0 , countmem = 0 , total = 0;
		for(int i = 0 ; i < this.members.size() ; i++) {
			System.out.println(i+1+"." + this.members.get(i).toString());
			if(this.members.get(i).getPosition().equals("chief")) countCheif++ ;
			else if(this.members.get(i).getPosition().equals("deputy chief")) countdeputy++ ;
			else if(this.members.get(i).getPosition().equals("secretary")) countsecretary++ ;
			else if(this.members.get(i).getPosition().equals("member")) countmem++ ;
			total += this.members.get(i).getAge();
		}
		System.out.println("Project"+this.projectName+" have "+countCheif+ " chief, "+countdeputy+" deputy chief, " 
				+countsecretary+" secretary and " +countmem+" member");
		System.out.println("Total age : "+total+ " Average age : " +total/this.numMember);
	}
}
