package engls;

import java.util.Scanner;

public class exercise2 {
	public static void main(String[] args) {
		//Create a variable for users introduced number storage
		int number;
		
		// Create a varibale to count the loops
		int counter = 0;
		
		//Open scanner
		Scanner rd = new Scanner(System.in);
		
		//Ask the user for the number
		System.out.println("Introduce a number to print the multiplication table");
		number = rd.nextInt();
		
		//Print the multiplication table from 1 to 10
		while (counter <= 10) {
			System.out.println(counter + " * " + number + " = " + counter*number);
			counter++;
		}
		
		//Close scanner
		rd.close();
	}
}
