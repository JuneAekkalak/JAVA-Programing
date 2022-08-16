
public class Score {
	int lab , attend , mid , fi_nal ;
	char grade; 
	public Score(int l ,int a , int m , int f) {
		this.lab = l ;
		this.attend = a ;
		this.mid = m;
		this.fi_nal = f ;
	}
	public void setGrade() {
		int sumScore = this.lab + this.attend + this.mid + this.fi_nal;
		if(sumScore >= 80 ) {
			this.grade = 'A';
		}
		else if (sumScore >= 70) {
			this.grade = 'B';
		}
		else if (sumScore >= 60) {
			this.grade = 'C';
		}
		else if (sumScore >= 50) {
			this.grade = 'D';
		}
		else this.grade = 'F' ;
	}
	public String toString() {
		int sumScore = 0 ;
		sumScore = this.lab + this.attend + this.mid + this.fi_nal;
		String ch = "";
		ch += this.lab + " \t\t" + this.attend + " \t\t" + this.mid + 
				" \t\t" + this.fi_nal + " \t\t"+ sumScore + " \t\t" + this.grade;
		return ch;
	}
}
