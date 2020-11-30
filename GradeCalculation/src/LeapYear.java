import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter year:");
		int year = sc.nextInt();
		if(year % 4  == 0) {
			if(year % 100 == 0 && year % 400 > 0)
				System.out.println("Non Leap Year");
			else
				System.out.println("Leap Year");
		}
		else
			System.out.println("Leap Year");
	}
}
