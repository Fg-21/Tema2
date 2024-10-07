package boletin1;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		/*Escribir un programa que pida al usuario tres números enteros, 
		 *y que muestre por pantalla si la suma de dos de esos números 
		 *da como resultado el otro número.*/
		
		//Creamos la variable del primer número
		int num1;
		
		//Creamos la variable del segundo número
		int num2;
				
		//Creamos la variable del tercer número
		int num3;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos los número al usuario
		System.out.println("Introduce el primer número:");
		num1 = rd.nextInt();
		
		System.out.println("Introduce el segundo número:");
		num2 = rd.nextInt();
		
		System.out.println("Introduce el tercer número:");
		num3 = rd.nextInt();
		
		/*Descartamos un número a la vez para comprobar si la suma de los restantes
		 *da igual al número descartado.*/
		
		if (num1+num2==num3) {
			System.out.println(num1 + " y " + num2 + " sumados dan " + num3);
		}
		else if (num1+num3==num2) {
			System.out.println(num1 + " y " + num3 + " sumados dan " + num2);
		}
		else if (num2+num3==num1) {
			System.out.println(num2 + " y " + num3 + " sumados dan " + num1);
		}
		else {
			System.out.println("No se da que 2 números sumados den como resultado el tercero");
		}
		
		//Cerramos scanner
		rd.close();
	}
}
