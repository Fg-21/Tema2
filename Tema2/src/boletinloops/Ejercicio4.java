package boletinloops;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		/*Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser positivos, negativos o cero).
		 *Cuando acabe de insertar los números, el algoritmo debe mostrar la suma de los números positivos, 
		 *la media de los números negativos y el número de ceros que ha introducido el usuario.*/
		
		//Creamos una variable para introducir números
		int numeros = 0;
		
		//Creamos una variable para hacer luego la media
		double cont = 0;
		
		//Creamos una variable para contar ceros 
		int contCeros = 0;
		
		//Creamos una variable para sumar los positivos
		int suma = 0;
		
		//Creamos un contador para la media de los números negativos
		int contNega = 0;
		
		//Creamos un sumatorio para los números negativos
		int sumaNega = 0;
		
		//Creamos una variable para guardar la media
		double media = 0;
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);

		
		//Repetiremos la operación 9 veces más
		while (cont < 10) {
			System.out.println("Introduce un número");
			suma = rd.nextInt();
			if (suma < 0) {
				contNega++;
				sumaNega += suma;
				media = sumaNega/contNega;
			} else if (suma == 0) {
				contCeros++;
			} else if (suma >= 0);{
				numeros += suma;
			}
			cont++;
		}
		
		//Mostramos los números positivos sumados
		System.out.println("Los numeros sumados son: " + numeros);
		
		//Mostramos los ceros introducidos
		System.out.println("Los ceros introducidos son: " + contCeros);

		//Mostramos la media de los números negativos
		System.out.println("La media de los números negativos introducidos son: " + media);
		
		//Cerramos scanner
		rd.close();
	}
}
