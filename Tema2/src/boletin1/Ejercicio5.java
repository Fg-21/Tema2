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

		// Creamos una variable para guardar el número mayor
		double mayor = 0;

		// Creamos una variable para guardar el númeor medio
		double medio = 0;

		// Creamos una variable para guardar el número menor
		double menor = 0;

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
		if (num1 >= num2 && num1 >= num3) {
			mayor = num1;
			if (num2 >= num3) {
				medio = num2;
				menor = num3;
			} else {
				medio = num3;
				menor = num2;
			}
		}
		if (num2 >= num1 && num2 >= num3) {
			mayor = num2;
			if (num1 >= num3) {
				medio = num1;
				menor = num3;
			} else {
				medio = num3;
				menor = num1;
			}
		}
		if (num3 >= num1 && num3 >= num2) {
			mayor = num3;
			if (num1 >= num2) {
				medio = num1;
				menor = num2;
			} else {
				medio = num2;
				menor = num1;
			}
		}
		System.out.println("Números ordenados: " + mayor + " > " + medio + " > " + menor);
		
		//Cerramos scanner
		rd.close();

	}
}
