package engls;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		
		//Create variable for users answer
		int number;
		
		//Create a variable for pair numbers
		int paircount = 0;
		
		//Create a variable for odd numbers
		int oddcount = 0;
		
		
		//Open scanner
		Scanner rd = new Scanner(System.in);
		
		//Ask the user the number
		System.out.println("Introduce a number");
		number = rd.hashCode();
		
		//Of the number is negative, we exit the loop
		
		while (number < 0 ) {
			if (number % 2 == 0) {
				paircount ++;
				System.out.println("Pair");
			} else {
				oddcount++;
				System.out.println("Odd");
			}
			System.out.println("Introduce a number");
			number = rd.hashCode();
	}
		
		// Show pairs & odds numbers to the user
		System.out.println("Pair numbers: " + paircount);
		System.out.println("Odd numbers: " + oddcount);
		
		//Close scanner
		rd.close();
}
	
	}
