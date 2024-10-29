package ejerciciospreexamen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que lea un número entero (lado) y a partir de él cree un
		 * cuadrado de asteriscos con ese tamaño. Los asteriscos sólo se verán en el
		 * borde del cuadrado, no en el interior:
		 */
		
		//Creamos la variable para que el usuario indique los lados
		int lado = 0;
		
		//Creamos una variable para registrar el error
		boolean error;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Comprobamos que los datos introducidos por el usuario están dentro de rango
		do {
			try {
				System.out.println("Introduce la longitud de los lados");
				lado = rd.nextInt();
				assert lado > 0 : "ERROR: la longitud de los lados no puede ser negativa";
				error = false;
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
				error = true;
			} catch (InputMismatchException e) {
				System.err.println("ERROR: el tipo no es entero");
				rd.nextLine();
				error = true;
			}
		} while (error);
		
		//Creamos el cuadrado basándonos en el numero introducido por el usuario
		for (int i = 1; i <= lado; i++) {
			for (int j = 1; j <= lado; j++) {
				
				if (i == 1 || i == lado || j == 1 || j == lado) {
				System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
		
		//Cerramos scanner
		rd.close();
	}
}

