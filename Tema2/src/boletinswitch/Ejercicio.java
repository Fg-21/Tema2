package boletinswitch;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		/*
		 * Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma:
		 * insuficiente (de 0 a 4), suficiente (5), bien (6), notable (7 y 8) y
		 * sobresaliente (9 y 10).
		 */

		// Creamos la variable de la nota a pedir por teclado
		int nota;

		// Abrimos scanner
		Scanner rd = new Scanner(System.in);

		// Pedimos la variable de la nota por teclado
		System.out.println("Introduce tu nota");
		nota = rd.nextInt();

		// Establecemos las respuestas para cada tipo de nota
		switch (nota) {
		case 1, 2, 3, 4 -> {
			System.out.println("INSUFICIENTE");
		}
		case 5 -> 
			System.out.println("SUFICIENTE");
		
		case 6 -> 
			System.out.println("BIEN");
		
		case 7, 8 -> {
			System.out.println("NOTABLE");
		}
		case 9, 10 -> {
			System.out.println("SOBRESALIENTE");
		}
		default -> 
			System.err.println("ENTRADA ERRÓNEA");
		}
		
		//Cerramos scanner
		rd.close();
	}

}
