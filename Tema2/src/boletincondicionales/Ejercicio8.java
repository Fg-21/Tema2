package boletincondicionales;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		/*
		 * Pedir al usuario el número de un mes y el año (comprobando si es o no
		 * bisiesto). Debe imprimir por pantalla el número de días que tiene el mes.
		 */

		// Creamos la variable del mes
		int mes;

		// Creamos la variable del año
		int año;

		// Abrimos scanner
		Scanner rd = new Scanner(System.in);

		// Preguntamos el número del mes al usuario
		System.out.println("Número del mes:");
		mes = rd.nextInt();

		// Preguntamos el año al usuario
		System.out.println("Año:");
		año = rd.nextInt();

		// Comprobamos si el año es bisiesto y si lo es y el usuario escoge febrero hay
		// que sumarle un día
		if (año % 4 == 0) {
			switch (mes) {
			case 1 -> {
				System.out.println("31 dias");
			}
			case 2 -> {
				System.out.println("29 dias");
			}
			case 3 -> {
				System.out.println("31 dias");
			}
			case 4 -> {
				System.out.println("30 dias");
			}
			case 5 -> {
				System.out.println("31 dias");
			}
			case 6 -> {
				System.out.println("30 dias");
			}
			case 7 -> {
				System.out.println("31 dias");
			}
			case 8 -> {
				System.out.println("31 dias");
			}
			case 9 -> {
				System.out.println("30 dias");
			}
			case 10 -> {
				System.out.println("31 dias");
			}
			case 11 -> {
				System.out.println("30 dias");
			}
			case 12 -> {
				System.out.println("31 dias");
			}
			default -> {
				System.err.println("ERROR, no existen meses con ese número");
			}
			}
		} else {
			switch (mes) {
			case 1 -> {
				System.out.println("31 dias");
			}
			case 2 -> {
				System.out.println("28 dias");
			}
			case 3 -> {
				System.out.println("31 dias");
			}
			case 4 -> {
				System.out.println("30 dias");
			}
			case 5 -> {
				System.out.println("31 dias");
			}
			case 6 -> {
				System.out.println("30 dias");
			}
			case 7 -> {
				System.out.println("31 dias");
			}
			case 8 -> {
				System.out.println("31 dias");
			}
			case 9 -> {
				System.out.println("30 dias");
			}
			case 10 -> {
				System.out.println("31 dias");
			}
			case 11 -> {
				System.out.println("30 dias");
			}
			case 12 -> {
				System.out.println("31 dias");
			}
			default -> {
				System.err.println("ERROR, no existen meses con ese número");
			}
			}
		}
		
		//Cerramos scanner
		rd.close();
	}
}
