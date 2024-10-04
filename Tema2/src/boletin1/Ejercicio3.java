package boletin1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		/*Implementar un programa que pida por teclado un número decimal e indique si es un número casi-cero, 
		 *que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1 unidad,
		 *aunque curiosamente el 0 no se considera un número casi-cero. 
		 *Es decir, un número casi-cero es el que se encuentra en el intervalo (-1, 1), 
		 *donde se excluye el -1, el 0 y el 1.*/
		
		//Creamos el número decimal a pedir por teclado
		double num;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos el número por teclado
		System.out.println("Introduce el número a deducir");
		num = rd.nextDouble();
		
		//Comprobamos con un if si es un número casi cero
		if (num>(-1) && num<1 && num!= 0) {
			System.out.println("Este número es un casi cero");
		}
		else {
			System.out.println("No es un casi cero");
		}
		
		//Cerramos scanner
		rd.close();
	}
}
