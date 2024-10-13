package boletincondicionales;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		/*
		 * Escribe una aplicación que solicite al usuario un número comprendido entre 0
		 * y 9999. La aplicación tendrá que indicar si el número introducido es capicúa.
		 * Un número es capicúa si se lee igual de izquierda a derecha que de derecha a
		 * izquierda.
		 */

		// Creamos la variable para que el usuario introduzca el número
		int numero;

		// Creamos una variable para guardar la primera cifra del número
		int cifra1;

		// Creamos una variable para guardar la segunda cifra del número
		int cifra2;

		// Creamos una variable para guardar la tercera cifra del número
		int cifra3;

		// Creamos una variable para guardar la cuarta cifra del número
		int cifra4;
		
		//Creamos una bandera para saber si el número es capicúa o no
		boolean bandera = false;

		// Abrimos scanner
		Scanner rd = new Scanner(System.in);

		// Preguntamos al usuario el número
		System.out.println("Introduce un número entre 0 y 9999 para averiguar si es capicúa:");
		numero = rd.nextInt();

		// Averiguamos las cifras de las que consta el número y averiguamos si es capicúa de un método u otro
		// Separamos el número en sus cifras para saber si es capicúa
		
		if (numero > 0 && numero < 10) {
			bandera = true;
		} else if (numero > 9 && numero < 100) {
			if (numero % 11 == 0) {
				bandera = true;
			}
		} else if (numero > 99 && numero < 1000) {
			cifra1 = numero / 100;
			cifra2 = numero % 10;
			if (cifra1 == cifra2) {
				bandera = true;
			}
		} else if (numero > 999 && numero < 9999) {
			cifra1 = numero % 10;
			cifra2 = numero / 10 % 10;
			cifra3 = numero / 100 % 10;
			cifra4 = numero / 1000 % 10;

			if (cifra1 == cifra4 && cifra2 == cifra3) {
				bandera = true;
			}
		}
		
		if (bandera == true) {
			System.out.println("Es capicúa");
		} else {
			System.out.println("No es capicúa");
		}
		
		//Cerramos scanner
		rd.close();
	}
}
