package boletinswitch;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		/*Idear un programa que solicite al usuario un número comprendido entre 1 y 7, 
		 *correspondiente a un día de la semana. Se debe mostrar el nombre del día de la semana 
		 *al que corresponde. Por ejemplo, el número 1 corresponde a “Lunes” y el 6 a “Sábado”.*/
		
		//Creamos la variable para el número del día de la semana
		int dias;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Preguntamos el número del día de la semana
		System.out.println("Introduce el número del día de la semana a mostrar, donde 1 es lunes, 2 martes etc.");
		dias = rd.nextInt();
		
		//Establecemos los nombres de los días para cada número y los imprimimos por pamtalla
		switch (dias) {
			case 1 -> 
				System.out.println("LUNES");
			
			case 2 -> 
				System.out.println("MARTES");
			
			case 3 -> 
				System.out.println("MIÉRCOLES");
			
			case 4 -> 
				System.out.println("JUEVES");
			
			case 5 -> 
				System.out.println("VIERNES");
			
			case 6 -> 
				System.out.println("SÁBADO");
			 
			case 7 -> 
				System.out.println("DOMINGO");
			
			default -> 
				System.err.println("ENTRADA ERRÓNEA");
		}
		
		//Cerramos scanner
		rd.close();
	}
}
