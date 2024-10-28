package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que lea un número n e imprima una pirámide de números con
		 * n filas como en la siguiente figura: 
		 * 1 
		 * 121 
		 * 12321 
		 * 1234321
		 */
		
		//Creamos la variable para guardar el número
		int num;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos el número al usuario
		System.out.println("Introduce el número");
		num = rd.nextInt();
		
		
		//Hacemos la escalera
		for (int cont = 1; cont <= num; cont++) {
			for (int cont2 = 1; cont2 < cont; cont2++) {
				System.out.print(cont2);
			}
			for (int cont3 = cont; cont3 > 0; cont3--) {
				System.out.print(cont3);
			}
			System.out.println();
		}
		
		//Cerramos scanner
		num = rd.nextInt();
	}
}
