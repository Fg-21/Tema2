package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		/*Realiza un programa que nos pida un número n y nos diga 
		 *cuántos números hay entre 1 y n que sean primos.*/
		
		//Creamos la variable para el numero n
		int num;
		
		//Creamos una variable para contar los números primos
		int contPrimos = 0;
		
		//Creamos una variable para contar el numero de restos de cada número
		int rest = 0;
		//Abrimos el scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario el número
		System.out.println("Introduce el número para averiguar los primos entre 1 y tu número");
		num = rd.nextInt();
		
		//Contamos los números y averiguamos cual es primo
		for(int cont = 1; cont <= num; cont++) {
			for (int cont2 = 1; cont2 <=cont; cont2++) {
				if (cont % cont2 == 0) {
					rest++;
				}
			}
			if (rest == 2) {
				contPrimos++;
			}
			rest = 0;
		}
		
		//Mostramos los numeros primos que hay
		System.out.println("Entre " + num + " y 1 hay: " + contPrimos + " número/s primo/s");
		
		//Cerramos scanner
		rd.close();
	}
}
