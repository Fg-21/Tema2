package boletin1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		/*Pedir dos números y mostrarlos ordenados de menor a mayor.*/
		
		//Creamos la variable para el primer número
		double num1;
		//Creamos la variable para el segundo número
		double num2;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos el primer número a leer por teclado
		System.out.println("Pon el primer número");
		num1 = rd.nextDouble();
		
		//Pedimos el segundo número a leer por teclado
		System.out.println("Pon el segundo número");
		num2 = rd.nextDouble();
		
		//Creamos un if para ver cual es mayor y mostrarlo primero
		if(num1>num2) {
			//Si el primer número es mayor va segundo en orden
			System.out.println(num2 + " < " + num1);
		}
		else if (num2>num1) {
			//Si el segundo número es mayo va segundo en orden
			System.out.println(num1 + " < " + num2);
			}
		else {
			//Si son iguales, los dos números se igualan y no hay orden
			System.out.println(num1 + " = " + num2);
		}
		//Cerramos scanner
		rd.close();
	}
}
