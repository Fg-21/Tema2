package boletin1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
	
		/* Diseñar una aplicación que solicite al usuario un número e indique si es par o impar.*/
		 
		// Creamos la variable del número
		int num1;

		// Abrimos scanner
		Scanner rd = new Scanner(System.in);

		// Pedimos el número
		System.out.println("Pon el primer número");
		num1 = rd.nextInt();

		// Averiguamos si es impar viendo los restos de dividir entre 2
		if ((num1 % 2 == 0)) {
			System.out.println("El número " + num1 + " es par");
		} else {
			System.out.println("El número" + num1 + " es impar");
		}
		
		//Cerramos scanner
		rd.close();
	}
}
