package boletincondicionales;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		/*Utiliza un operador ternario para calcular el valor absoluto de un número que se solicita al usuario por teclado.*/
		
		//Creamos la variable del número a pedir por teclado
		double numero;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario el número para calcular su valor absoluto
		System.out.println("Introduce el número para saber su valor absoluto:");
		numero = rd.nextDouble();
		
		//Si el número es positivo su valor absoluto es el mismo número, si es negativo lo multiplicamos por -1
		System.out.println("El valor absoluto de " + numero + " es: " + (numero >= 0 ? numero: numero*(-1)));
		
		//Cerramos scanner
		rd.close();
	}
}
