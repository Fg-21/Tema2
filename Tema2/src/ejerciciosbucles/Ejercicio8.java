package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que lea y acepte únicamente aquellos que sean mayores que
		 * el último dado. La introducción de números finaliza con la introducción de un
		 * 0. Al final se mostrará: El total de números introducidos, excluido el 0. El
		 * total de números fallados.
		 */
		
		
		//Creamos la variable para el primer número
		int num1 = 0;
		
		//Creamos la variable para el segundo número
		int num2 = 0;
		
		//Creamos la variable para contar los números introducidos
		int cont = 2;
		
		//Creamos la variable para contar los fallos
		int contF = 0;
		
		//Creamos la variable para registrar el error
		boolean error;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Comprobamos que los datos no son cadenas y son enteros
		do {
			try {
				System.out.println("Introduce el primer número");
				num1 = rd.nextInt();
				
				System.out.println("Introduce el segundo número");
				num2 = rd.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.err.println("ERROR: El tipo introducido no es un entero");
				rd.nextLine();
				error = true;
			}
		} while (error);
		
		//Preguntamos al usuario los dos números y los comparamos
		while (num1 > 0 && num2 > 0) {
			
			if (num1 <= num2) {
				cont += 2;
			} else if (num1 > num2){
				System.out.println("Fallo, es menor");
				cont += 2;
				contF++;
			}
			System.out.println("Introduce el primer número");
			num1 = rd.nextInt();
			
			System.out.println("Introduce el segundo número");
			num2 = rd.nextInt();
		}
		
		//Mostramos los números introducidos y fallados
		System.out.println("Números introducidos: " + cont);
		System.out.println("Números fallados: " + contF);
		
		//Cerramos scanner
		rd.close();
	}
}
