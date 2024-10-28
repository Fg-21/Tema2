package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que nos diga si un número introducido por teclado es
		 * capicúa o no. El número debe ser mayor o igual que 0.
		 */
		
		//Creamos la variable para el número a pedir al usuario
		int num = 0;
		
		int resto;
		
		int invertido = 0;
		
		//Creamos la variable para guardar el número capicúa
		int capi;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Comprobamos que el número esta dentro de rango
		do {
			System.out.println("Introduce el número");
			num = rd.nextInt();
		} while (num < 0);
		
		
		//Invertimos el número para compararlo
		capi = num;
		while (num > 0) {
            resto = num % 10;
            invertido = invertido * 10 + resto;
            num /= 10;
        }
		
		//Decimos si es capicúa o no
		if (capi == invertido) {
			System.out.println("Es capicua");
		} else System.out.println("No es capicúa");
		
		
		//Cerramos scanner
		rd.close();
	}
}
