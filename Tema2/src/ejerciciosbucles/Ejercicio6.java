package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		/*
		 * Solicita al usuario un número n y dibuja un triángulo de base y altura n. Por
		 * ejemplo para n=4 debe dibujar lo siguiente:
		 *        *
		 *       * *
		 *      * * *
		 *     * * * *
		 */
		
		//Creamos una variable para guardar la altura de la pirámide
		int num;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos el número al usuario
		System.out.println("Introduce el número para la altura de la pirámide");
		num = rd.nextInt();
		
		//Hacemos la pirámide
		for (int cont = 1; cont <= num; cont++) {
			for (int espacio = 0; espacio < num - cont; espacio++) {
				System.out.print(" ");
			}
			for (int aste = 0; aste < cont; aste++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		//Cerramos scanner
		rd.close();
	}
}
