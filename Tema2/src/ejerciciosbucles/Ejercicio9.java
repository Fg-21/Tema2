package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
		 * por teclado. El número introducido debe ser mayor que 0.
		 */
		
		//Creamos la variable para guardar el número introducido
		int num;
		
		//Creamos la variable para guardar el número de cifras
		int cifras = 1;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		
		//Comprobamos que el número es mayor que 0
		do {
			//Pedimos el número al usuario
			System.out.println("Introduce el número");
			num = rd.nextInt();
		} while (num < 0);
		
		//Contamos las cifras
		while (num > 9) {
			num /= 10;
			cifras++;
		}
		
		//Mostramos las cifras del número
		System.out.println("El número tiene " + cifras + " cifras");
		
		//Cerramos scanner
		rd.close();
	}
}
