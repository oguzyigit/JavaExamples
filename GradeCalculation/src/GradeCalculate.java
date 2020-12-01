import java.util.Scanner;

public class GradeCalculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter midterm:");
		double midTerm = sc.nextDouble();
		System.out.println("Please enter process essay:");
		double processEssay = sc.nextDouble();
		System.out.println("Please enter Discussion Session:");
		double discussionSession = sc.nextDouble();
		System.out.println("Please enter In Lecture Questions:");
		double inLecture = sc.nextDouble();

		double total = (40*midTerm)/100 + (30*processEssay)/100 + (20* discussionSession)/100 + (10*inLecture) /100;
		System.out.println("Total Point:" + total);
		
		if(total >= 90)
			System.out.println("Your letter Grade : A ");
		else if (total>= 86 && total < 90)
			System.out.println("Your letter Grade : A-");
		else if (total>= 82 && total < 86)
			System.out.println("Your letter Grade : B+");
		else if (total>= 78 && total < 82)
			System.out.println("Your letter Grade : B ");
		else if (total>= 74 && total < 78)
			System.out.println("Your letter Grade : B-");
		else if (total>= 70 && total < 74)
			System.out.println("Your letter Grade : C+");
		else if (total>= 66 && total < 70)
			System.out.println("Your letter Grade : C ");
		else if (total>= 62 && total < 66)
			System.out.println("Your letter Grade : C-");
		else if (total>= 58 && total < 62)
			System.out.println("Your letter Grade : D+");
		else if (total>= 54 && total < 58)
			System.out.println("Your letter Grade : D");
		else
			System.out.println("Your letter Grade : F");
			
		
	}
}
