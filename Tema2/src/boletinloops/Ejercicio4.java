package boletinloops;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		/*Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser positivos, negativos o cero).
		 *Cuando acabe de insertar los números, el algoritmo debe mostrar la suma de los números positivos, 
		 *la media de los números negativos y el número de ceros que ha introducido el usuario.*/
		
		//Creamos una variable para introducir números
		int numeros;
		
		//Creamos una variable para hacer luego la media
		double cont = 0;
		
		//Creamos una variable para contar ceros 
		double contCeros = 0;
		
		//Creamos una variable para sumar los positivos
		int suma = 0;
		
		//Creamos una variable para guardar la media
		double media;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario el primer número
		System.out.println("Introduce el primer número");
		numeros = rd.nextInt();
		
		//Repetiremos la operación 9 veces más
		while (cont<9) {
			++cont;
			if (suma < 0) {
				media= suma/cont;
			} else if (numeros == 0) {
				contCeros++;
			} else if (suma >= 0);{
				numeros += suma;
			}
			System.out.println("Introduce el siguiente número");
			suma = rd.nextInt();
		}
	}
}
