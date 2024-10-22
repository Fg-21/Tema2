package boletinfor;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		/*Pedir diez números por teclado y mostrar la media.*/
		
		//Creamos la variable para guardar los números 
		int nums;
		
		// Creamos la variable donde se sumarán los números
		int suma = 0;
		
		double cont;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Creamos el bucle donde pedir y sumar los números
		for (cont = 0; cont < 10; cont++) {
			System.out.println("Introduce el número :");
			nums = rd.nextInt();
			suma += nums;
		}
		
		//Imprimimos la media
		System.out.println("La media es: " + suma/cont);
		
		//Cerramos scanner
		rd.close();
	}
}
