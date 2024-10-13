package boletincondicionales;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		/*
		 * El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene a
		 * partir del número de la siguiente forma: letra = número DNI módulo 23 Diseña
		 * una aplicación en la que, dado un número de DNI, calcule la letra que le
		 * corresponde. Observa que un número de 8 dígitos está dentro del rango del
		 * tipo int.
		 */

		// Creamos la variable para introducir el número del dni
		int dniNum;

		// Abrimos scanner
		Scanner rd = new Scanner(System.in);

		// Pedimos el número del DNI al usuario
		System.out.println("Introduce el número de DNI:");
		dniNum = rd.nextInt();

		// A partir de la fórmula, calculamos la letra que le correspondeal DNI
		// introducido
		if (dniNum < 1000000000 && dniNum > 9999999) {
			switch (dniNum % 23) {
			case 0 -> {
				System.out.println("La letra correspondiente es la T");
			}
			case 1 -> {
				System.out.println("La letra correspondiente es la R");
			}
			case 2 -> {
				System.out.println("La letra correspondiente es la W");
			}
			case 3 -> {
				System.out.println("La letra correspondiente es la A");
			}
			case 4 -> {
				System.out.println("La letra correspondiente es la G");
			}
			case 5 -> {
				System.out.println("La letra correspondiente es la M");
			}
			case 6 -> {
				System.out.println("La letra correspondiente es la Y");
			}
			case 7 -> {
				System.out.println("La letra correspondiente es la F");
			}
			case 8 -> {
				System.out.println("La letra correspondiente es la P");
			}
			case 9 -> {
				System.out.println("La letra correspondiente es la D");
			}
			case 10 -> {
				System.out.println("La letra correspondiente es la X");
			}
			case 11 -> {
				System.out.println("La letra correspondiente es la B");
			}
			case 12 -> {
				System.out.println("La letra correspondiente es la N");
			}
			case 13 -> {
				System.out.println("La letra correspondiente es la J");
			}
			case 14 -> {
				System.out.println("La letra correspondiente es la Z");
			}
			case 15 -> {
				System.out.println("La letra correspondiente es la S");
			}
			case 16 -> {
				System.out.println("La letra correspondiente es la Q");
			}
			case 17 -> {
				System.out.println("La letra correspondiente es la V");
			}
			case 18 -> {
				System.out.println("La letra correspondiente es la H");
			}
			case 19 -> {
				System.out.println("La letra correspondiente es la L");
			}
			case 20 -> {
				System.out.println("La letra correspondiente es la C");
			}
			case 21 -> {
				System.out.println("La letra correspondiente es la K");
			}
			case 22 -> {
				System.out.println("La letra correspondiente es la E");
			}
			}
		} else {
			System.err.println("El número introducido no es válido");
		}

		// Cerramos scanner
		rd.close();
	}
}
