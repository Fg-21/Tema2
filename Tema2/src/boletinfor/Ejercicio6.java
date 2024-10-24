package boletinfor;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		/* Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso. */

		// Creamos la variable para almacenar las calificaciones
		double grades;

		// Creamos la variable para almacenar los suspensos
		int f = 0;

		// Abrimos scanner
		Scanner rd = new Scanner(System.in);

		// Creamos un bucle donde si la nota es menor que 5 sea suspenso
		for (int cont = 0; cont < 5; cont++) {
			System.out.println("Introduce la nota(Solo dos decimales): ");
			grades = rd.nextDouble();
			if (grades < 5)
				f++;
		}

		// Mostramos el número de suspensos
		System.out.println("El número de suspensos total ha sido de: " + f);

		// Cerramos scanner
		rd.close();
	}
}
