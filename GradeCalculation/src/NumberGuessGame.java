import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
	public static void main(String[] args) {
		
		Random r = new Random();
		int randNum = r.nextInt(100);
		System.out.println(randNum);
		int i = 0;
		int guessedNumber = 0;
		Scanner sc = new Scanner(System.in);
		while(i<10) {
			System.out.println("Lütfen tahminizi giriniz");
			guessedNumber = sc.nextInt();
			if(guessedNumber == randNum) {
				System.out.println("Tebrikler " + (i+1) +". denemede sayıyı bildiniz");
				break;
			}else if (guessedNumber < randNum) {
				System.out.println("Daha yüksek bir sayı giriniz");
			}else {
				System.out.println("Daha düşük bir sayı giriniz");
			}
			
			System.out.println((i+1) + ". denemede hala bulamadın");
			i++;
		}
	}
}
