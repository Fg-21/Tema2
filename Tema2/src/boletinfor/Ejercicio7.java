package boletinfor;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		/*Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.*/
		
		//Creamos la variable para guardar el número a pedir al usuario
		int num;
		
		//Creamos la variable para guardar la cantidad de resto 0 del número
		int rest = 0;
		
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos el número al usuario
		System.out.println("Introduce el número para saber si es primo");
		num = rd.nextInt();
		
		//Hacemos un bucle para averiguar los restos de las divisiones de ese número
		for (double cont = 0; cont <= num; cont++) {
			if (num % cont == 0)
				rest++;
		}
		if (rest == 2)
			System.out.println("Es primo");
		else {
			System.out.println("No es primo");
		}
		
		//Cerramos scanner
		rd.close();
		
	}
}
