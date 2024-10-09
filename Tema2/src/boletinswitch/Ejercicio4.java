package boletinswitch;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		/*Escribe un algoritmo para sumar dos tiradas de un dado de seis caras que haría el usuario.
		 * El algoritmo pregunta al usuario cuánto ha sacado en la primera tirada y 
		 * el usuario le dará esa información pero en formato cadena (“UNO”, “DOS” … “SEIS”).
		 * Después el algoritmo volverá a preguntar al usuario cuánto ha sacado en la segunda tirada y
		 * el usuario también dará esa información en formato cadena.
		 * Por último, el algoritmo mostrará por pantalla la suma de las dos tiradas en formato numérico.*/
		
		//Creamos varible para poner la primera tirada
		String tirada1;
		
		//Creamos variable para la segunda tirada
		String tirada2;
		
		//Creamos la variable para almacenar la respuesta en formato numérico
		int answ1;
		
		//Creamos la variable para almacenar la respuesta en formato numérico
		int answ2;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		

		
		//Pedimos el valor de la primera tirada
		System.out.println("¿Qué sae en la primera tirada? Escríbelo en letras");
		tirada1 = rd.nextLine();
		
		//Pasamos a formato numérico la respuesta de la tirada 1
		answ1 = switch (tirada1.toUpperCase()) {
		
		case "UNO" -> {
		yield 1;
		}
		case "DOS" -> {
		yield 2;
		}
		case "TRES" -> {
		yield 3;
		}
		case "CUATRO" -> {
		yield 4;
		}
		case "CINCO" -> {
		yield 5;
		}
		case "SEIS" -> {
		yield 6;
		}
		default ->{
			System.err.println("ENTRADA INCORRECTA");
		yield -1;}
		};
		
		//Pedimos el valor de la segunda tirada
		System.out.println("¿Qué sae en la segunda tirada? Escríbelo en letras");
		tirada2 = rd.nextLine();
		
		//Pasamos a formato numérico la respuesta de la tirada 2
		answ2 = switch (tirada2.toUpperCase()) {
		
		case "UNO" -> {
		yield 1;
		}
		case "DOS" -> {
		yield 2;
		}
		case "TRES" -> {
		yield 3;
		}
		case "CUATRO" -> {
		yield 4;
		}
		case "CINCO" -> {
		yield 5;
		}
		case "SEIS" -> {
		yield 6;
		}
		default ->{
			System.err.println("ENTRADA INCORRECTA");
		yield -1;}
		};
		
		//Sumamos las tiradas
		System.out.println("La suma de tus tiradas es: " + (answ1+answ2));
		
		//Cerramos scanner
		rd.close();
		
		
}
}
