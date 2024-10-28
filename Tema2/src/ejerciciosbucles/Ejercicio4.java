package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		/* De forma similar a la actividad 4, realiza un programa que calcule el mínimo
		 * común múltiplo de dos números dados. En este caso, habrá que partir del
		 * máximo de los dos e ir incrementando hasta encontrar el primer número que sea
		 * múltiplo de los dos números.*/
		
		//Creamos las variables para guardar los dos numeros
		int numA, numB;
		
		//Creamos una variable para guardar el MCM
		int mcm = 0;
		
		int cont = 0;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario los números
		System.out.println("Introduce el número A");
		numA = rd.nextInt();
		
		System.out.println("Introduce el número B");
		numB = rd.nextInt();
		
		//Comprobamos cual es mayor y menor y hacemos el máximo comun divisor
		if (numA > numB) {
			cont = numA;
			do {
				
				if (cont % numB == 0 && cont % numA == 0) {
					mcm = cont;
				} else {
					cont++;
				}
			} while (mcm != cont);
		
		} else if (numB > numA) {
			cont = numB;
			do {
				if (cont % numB == 0 && cont % numA == 0) {
					mcm = cont;
				} else {
					cont++;
				}
			} while (mcm != cont);
		
		} else {
			mcm = numA;
		}
		
		//Mostramos el mcm
		System.out.println("El mínimo comúm multiplo es: " + mcm);
		
		//Cerramos scanner
		rd.close();
	}
}
