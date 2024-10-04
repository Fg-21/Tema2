package boletin1;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		/* Pedir tres números y mostrarlos ordenados de mayor a menor. */

		// Creamos la variable para el primer número
		double num1;

		// Creamos la variable para el segundo número
		double num2;

		// Creamos la variable para el tercer número
		double num3;

		// Abrimos scanner
		Scanner rd = new Scanner(System.in);

		// Pedimos el primer número a leer por teclado
		System.out.println("Pon el primer número");
		num1 = rd.nextDouble();

		// Pedimos el segundo número a leer por teclado
		System.out.println("Pon el segundo número");
		num2 = rd.nextDouble();

		// Pedimos el tercer número a leer por teclado
		System.out.println("Pon el tercer número");
		num3 = rd.nextDouble();

		// Abrimos condicional para ordenar los números
		if ((num1 > num2 && num1 > num3)
				&& ((num2 < num1 && num2 > num3) || (num2 < num3 && num2 > num1) && (num3 < num1 && num3 < num2))) {
			// Si es el menor se pone el primer dígito
			System.out.println(num1 + " > " + num2 + " > " + num3);
		} else if ((num2 > num1 && num2 > num3)
				&& ((num1 < num2 && num1 > num3) || (num1 < num3 && num1 > num2) && (num3 < num2 && num3 < num1))) {
			// Si es el menor se pone el primer dígito
			System.out.println(num2 + " > " + num1 + " > " + num3);
		}
			else {
				
			}
			
		}
	}
