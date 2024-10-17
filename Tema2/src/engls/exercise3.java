package engls;

import java.util.Scanner;

public class exercise3 {
	public static void main(String[] args) {
		
		//Variable for the height asked to the user
		double height;
		
		//Variable for max height
		double maxHeight = 0;
		
		//Variable for minimun height
		double minHeight = maxHeight;
		
		//Open scanner
		Scanner rd = new Scanner(System.in);
		
		//Ask the user for height
		System.out.println("Introduce the height");
		height = rd.nextDouble();
		
		//Keep introducing height untill someone introduces 0
		while (height != 0) {
			if (maxHeight > height) {
				maxHeight = height;
			} 
			if (minHeight < height){
				minHeight = height;
			}
			System.out.println("Introduce the height");
			height = rd.nextDouble();
		}
		
		//Show the minimun & maximun heights
		System.out.println("Highest height: " + maxHeight);
		System.out.println("Lowest height: " + minHeight);
		
		//Close scanner
		rd.close();
	}
}
