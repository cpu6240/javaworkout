package chapter4;

public class IfExample3 {
	public static void main(String[] args) {
		int score = 75;
		char grade;
		
		if (score >= 90) {
			grade = 'A';
			System.out.println(grade);
		}
		else if (score >= 80) {
			grade = 'B';
			System.out.println(grade);
		}
		else if (score >= 70) {
			grade = 'C';
			System.out.println(grade);
		}
		else if (score >= 60) {
			grade = 'D';
			System.out.println(grade);
		}
		else {
			grade = 'F';
			System.out.println(grade);
		}
		System.out.println("학점은"+grade+"입니다.");
	}
}
