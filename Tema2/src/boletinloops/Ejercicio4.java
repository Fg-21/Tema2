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
		int cont = 0;
		
		//Creamos una variable para contar ceros 
		int contCeros = 0;
		
		//Creamos una variable para sumar los positivos
		int suma = 0;
		
		//Creamos un contador para la media de los números negativos
		int contNega = 0;
		
		//Creamos un sumatorio para los números negativos
		int sumaNega = 0;
		
		//Creamos una variable para guardar la media
		double media;
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);

		
		//Repetiremos la operación 9 veces más
		while (cont < 10) {
			System.out.println("Introduce un número");
			numeros = rd.nextInt();
			if (numeros < 0) {
				contNega++;
				sumaNega += numeros;
			} else if (numeros == 0) {
				contCeros++;
			} else {
				suma += numeros;
			}
			cont++;
		}
		
		//Mostramos los números positivos sumados
		System.out.println("Los numeros sumados son: " + suma);
		
		//Mostramos los ceros introducidos
		System.out.println("Los ceros introducidos son: " + contCeros);

		//Calculamos la media
		media = sumaNega/contNega;
		
		//Mostramos la media de los números negativos
		System.out.println("La media de los números negativos introducidos son: " + media);
		
		//Cerramos scanner
		rd.close();
	}
}
