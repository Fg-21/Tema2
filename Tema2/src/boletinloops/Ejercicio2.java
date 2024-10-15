package boletinloops;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		/*Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir contando. 
		 *Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, 
		 *antes de acabar, mostrará la cantidad de números positivos introducidos por el usuario.*/
		
		//Creamos la variable para establecer el número inicial
		int numeros;
		
		//Creamos la variable para ir sumando los número positivos
		int suma = 0;
		
		//Creamos una variable para contar los números introducidos por el usuario
		int cont = 0;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Preguntamos al usuario el número inicial
		System.out.println("Introduce un número inicial, para parar de sumar introduce un número negativo:");
		numeros = rd.nextInt();
		
		//Hacemos un bucle para ir sumando números hasta que el usuario introduzca un negativo
		while (suma >= 0) {
			numeros += suma;
			cont++;
			System.out.println("Introduce un número a sumar, para parar de sumar introduce un número negativo:");
			suma = rd.nextInt();
			
		}
		
		//Mostramos el total de la suma de los números y la cantidad de números introducidos
		System.out.println("La suma de los números es de: " + numeros);
		System.out.println("La cantidad de los números positivos introducidos es de: " + cont);
		
		//Cerramos scanner
		rd.close();
	}
}
