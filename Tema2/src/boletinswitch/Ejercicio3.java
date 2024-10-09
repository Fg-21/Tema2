package boletinswitch;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		/*Escribe un algoritmo que le pida al usuario dos números. 
		 * A continuación debe mostrar el siguiente menú por pantalla:
		 * SUMAR LOS NÚMEROS
		   RESTAR LOS NÚMEROS
		   MULTIPLICAR LOS NÚMEROS
		   DIVIDIR LOS NÚMEROS*/
		
		//Creamos la variable para uno de los números a operar
		double num1;
		
		//Creamos la variable para uno de los números a operar
		double num2;
		
		//Creamos el número para seleccionar la operación
		String select;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos los números a operar
		System.out.println("Primer número a operar");
		num1 = rd.nextDouble();
		
		System.out.println("Segundo número a operar");
		num2 = rd.nextDouble();
		
		//Pedimos al usuario que seleccione una operación
		System.out.println("Selecciona un tipo de operacion");
		System.out.println("A -> SUMA ");
		System.out.println("B -> RESTA");
		System.out.println("C -> MULTIPLICACIÓN");
		System.out.println("D -> DIVISIÓN");
		select = rd.next();
		
		//Operamos según la opción seleccionada
		switch (select.toUpperCase()) {
		case "A" ->
		System.out.println("El resultado de la  es " + (num1+num2));
		
		case "B" ->
		System.out.println("El resultado de la  es " + (num1-num2));
		
		case "C" ->
		System.out.println("El resultado de la  es " + num1*num2);
		
		case "D" ->
		System.out.println("El resultado de la  es " + num1/num2);
		
		default ->
		System.err.println("ERROR DE ENTRADA");
		}
		
		//Cerramos scanner
		rd.close();
	}
}
