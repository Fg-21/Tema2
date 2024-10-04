package boletin1;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		/*Pedir dos números enteros y decir si son iguales o no.*/
		
		//Creamos la variable para el número 1
		int num1;
		
		//Creamos la variable para el número 2
		int num2;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos el primer número
		System.out.println("Introduce el primer número");
		num1 = rd.nextInt();
		
		//Pedimos el segundo número
		System.out.println("Introduce el segundo número");
		num2 = rd.nextInt();
		
		//Abrimos condicional pra ver si si son iguales
		if (num1==num2) {
			System.out.println(num1 + " y " + num2 + " son iguales");
		}
		else {
			System.out.println(num1 + " y " + num2 + " no son iguales");
		}
		
		//Cerramos scanner
		rd.close();
	}
}
