package boletinfor;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		/*Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará todos los números del 1 al n.*/
		
		//Creamos la variable para pedir el número al usuario
		int numero;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos el número hasta el cual contar
		System.out.println("Introduce el número hasta el que contar empezando por 1");
		numero = rd.nextInt();
		
		//Contamos y escribimos los números con un bucle FOR
		for (int cont = 1; cont <= numero; cont++) {
			System.out.println(cont);
		}
		
		//Cerramos scanner
		rd.close();
	}
}
