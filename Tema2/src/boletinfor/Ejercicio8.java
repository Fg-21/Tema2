package boletinfor;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		/*Realiza un programa que pida dos números enteros A y B. Luego visualiza los números que hay entre A y B. 
		 *Si A es menor que B, entonces debe mostrar los números desde A hasta B. Si B es menor que A, entonces debe mostrar los números desde B hasta A.*/
		
		//Creamos las variable para guardar los números A y B
		int numA, numB;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);

		//Pedimos al usuario los dos números
		System.out.println("Introduce el número A:");
		numA = rd.nextInt();
		
		System.out.println("Introduce el número B:");
		numB = rd.nextInt();
		
		//Vemos quien es mayor y generamos un bucle u otro dependiendo de eso
		if (numA < numB) {
			for (int cont = numA; cont <= numB; cont++) {
				System.out.println(cont);
			}
		} else if (numA > numB) {
			for (int cont = numB; cont <= numA; cont++) {
				System.out.println(cont);
			}
		} else {
			System.err.println("LOS DOS NÚMEROS SON IGUALES");
		}
		
		//Cerramos scanner
		rd.close();
	}
}
