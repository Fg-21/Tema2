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
		
		//Creamos una variable para definir si hay error en nuestro codigo
		boolean error;
	
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Comprobamos que el número esta dentro de rango
		do {	
			try {
				System.out.println("Introduce el número");
				num = rd.nextInt();
				assert num > 0 : "El número es negativo";
				error = false;
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
				rd.nextLine();
				error = true;
			}
		} while (error);
		
		
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
