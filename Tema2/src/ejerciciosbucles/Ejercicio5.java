package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		/* Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre
		 * por pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada
		 * número tantas veces como su valor. Ejemplo: */
		
		//Creamos la variable para el número a pedir al usuario
		int num;
		
		//Creamos la variable para el bucle anidado
		int cont2 = 0;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos el numero al usuario
		System.out.println("Introduce el número (Entre 0 y 20)");
		num = rd.nextInt();
		
		//Comprobamos que el número esta dentro del rango
		while (num < 0 || num > 20) {
			System.err.println("NUMERO FUERA DE RANGO. INTRODÚCELO OTRA VEZ");
			num = rd.nextInt();
		}
		
		
		//Imprimimos la estructura
		
		for (int cont = 1; cont <= num; cont++) {
			cont2= 0;
				while (cont2 < cont) {
					System.out.print(cont);
					cont2++;
				}
				System.out.println();
			
		}
		
		//Cerramos scanner
		rd.close();
	}
}
