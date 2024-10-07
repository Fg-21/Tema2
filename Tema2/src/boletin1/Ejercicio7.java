package boletin1;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		/*Escribir una aplicación que indique cuántas cifras tiene un número 
		 *introducido por teclado, que está comprendido entre 0 y 99999. */
		
		//Creamos la variable del número a introducir por teclado
		int num;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos el número por teclado
		System.out.println("Introduce el número para indicar sus cifras (Comprendido entre 0 y 99999): ");
		num = rd.nextInt();
		
		/*Vemos los límites en los cuales los número pasan de tener una cifra más 
		 *y basamos nuestras condiciones en ello*/
		if (num<10 && num>=0) {
			System.out.println("El número tiene 1 cifra");
		}
		else if (num>9 && num<=99) {
			System.out.println("El número tiene 2 cifras");
		}
		else if (num<1000 && num>99) {
			System.out.println("El número tiene 3 cifras");
		}
		else if (num<10000 && num>999) {
			System.out.println("El número tiene 4 cifras");
		}
		else if (num<100000 && num>9999) {
			System.out.println("El número tiene 5 cifras");
		}
		else {
			System.out.println("El número tiene más cifras de las permitidas o es negativo");
		}
		
		//Cerramos scanner
		rd.close();
	}
}
