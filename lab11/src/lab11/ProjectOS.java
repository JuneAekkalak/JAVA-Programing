package lab11;
import java.util.ArrayList ;
import java.util.Scanner ;
public class ProjectOS {

	public static void main(String[] args) {
		final int maxMember = 5 ;
		ArrayList <Member> member = new ArrayList <Member>();
		member.add(new Member("AAA", "chief",30 ));
		member.add(new Member("BBB", "deputy chief",29 ));
		member.add(new Member("CCC", "secretary",25));
		member.add(new Member("DDD","member", 22 ));
		member.add(new Member("FFF" ,"member" ,23 ));
		Project project = new Project(member.size() , maxMember);
		project.addMember(member);
		project.displayProject();
		Scanner input = new Scanner(System.in);
		char yn = 'y';
		while(yn == 'y') {
			System.out.print("Please select action [C|D|A] : ");
			char ch = input.next().charAt(0);
			if(ch == 'C') {
				System.out.print("Enter name: ");
				String name = input.next();
				System.out.print("New position: ");
				String po = input.next();
				for(Member m : member) 
					if(m.getName().equals(name)) m.changePosition(po);
			}
			else if(ch == 'D') {
				System.out.print("Enter name: ");
				String name = input.next();
				for(int i = 0 ; i < member.size(); i++) 
					if(member.get(i).getName().equals(name)) project.deleteMember(member.get(i));
			}
			else if (ch == 'A') {
				System.out.print("Name : ");
				String newName = input.next();
				System.out.print("Position : ");
				String newPo = input.next();
				System.out.print("Age : ");
				int newAge = input.nextInt();
				project.addMember(new Member(newName , newPo , newAge));
			}
			project.displayProject();
			System.out.print("Do you want to continue [y/n]: ");
			yn = input.next().charAt(0);
		}
		System.out.println("Bye Bye !!!");
	}
}
