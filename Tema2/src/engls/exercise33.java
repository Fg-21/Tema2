package engls;

import java.util.Random;
import java.util.Scanner;

public class exercise33 {
	public static void main(String[] args) {
		
		
		//Variable for user guess
		int numberguess;
		
		//Variable for random number
		int randomNumber;
		Random random = new Random();
		
		//Open scanner
		Scanner rd = new Scanner(System.in);
		
		//Ask the user the guess
		System.out.println("Introduce ur guess");
		numberguess = rd.nextInt();
		
		//Generate random number
		randomNumber = random.nextInt(10) +1;
		
		//While the user dont give up (imput -1), we keep asking for guesses
		while (numberguess != -1 && numberguess != randomNumber) {
			if (numberguess > randomNumber) {
				System.out.println("Lower");
			}
			else if (numberguess < randomNumber) {
				System.out.println("Higher");
			}
			System.out.println("Introduce ur guess");
			numberguess = rd.nextInt();
		}
		System.out.println("END");
		
		//Close scanner
		rd.close();
	}
}
