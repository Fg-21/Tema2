package boletinloops;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		/*Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir sumando.
		 *Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, antes de acabar, 
		 *mostrará la media de los números positivos introducidos por el usuario.*/
		
		//Creamos la variable para establecer el número inicial
		int numeros = 0;
		
		//Creamos la variable para ir sumando los número positivos
		int suma = 0;
		
		//Creamos una variable para contar los números introducidos por el usuario
		int cont = 0;
		
		//Creamos una variable para guardar la media
		double media;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Preguntamos al usuario el número inicial
		System.out.println("Introduce un número inicial, para parar de sumar introduce un número negativo:");
		numeros = rd.nextInt();
		
		//Hacemos un bucle para ir sumando números hasta que el usuario introduzca un negativo
		while (numeros >= 0) {
			suma += numeros;
			cont++;
			System.out.println("Introduce un número a sumar, para parar de sumar introduce un número negativo:");
			numeros = rd.nextInt();
			
		}
		
		//Calculamos la media
		media = suma/cont;
		
		//Mostramos el total de la suma de los números y la media de números introducidos
		System.out.println("La suma de los números es de: " + suma);
		System.out.println("La media de los números introducidos es de: " + media);
		
		//Cerramos scanner
		rd.close();
	}
}
