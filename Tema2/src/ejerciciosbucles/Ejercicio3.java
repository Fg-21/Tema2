package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		/*Para dos números dados, a y b, es posible calcular el máximo común divisor
		 * (el número más grande que divide a ambos) mediante un algoritmo ineficiente
		 * pero sencillo: desde el menor de a y b, ir buscando, de forma decreciente
		 * (-1), el primer número que divide a ambos simultáneamente. Teniendo en cuenta
		 * lo que se acaba de explicar, realiza un programa que calcule el máximo común
		 * divisor de dos números.*/
		
		//Creamos las variables para guardar los dos numeros
		int numA, numB;
		
		//Creamos una variable para guardar el MCD
		double mcd = 0;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario los números
		System.out.println("Introduce el número A");
		numA = rd.nextInt();
		
		System.out.println("Introduce el número B");
		numB = rd.nextInt();
		
		//Comprobamos cual es mayor y menor y hacemos el máximo comun divisor
		if (numA > numB) {
			for (double cont = numB; cont > mcd; cont--) {
				if (numB % cont == 0 && numA % cont == 0) {
					mcd += cont;
				}
			}
		} else if (numB > numA) {
			for (double cont = numA; cont > mcd; cont--) {
				if (numA % cont == 0 && numB % cont == 0) {
					mcd += cont;
				}
			}	
		} else {
			for (double cont = numA; cont > mcd; cont--) {
				if (numA % cont == 0 && numB % cont == 0) {
					mcd += cont;
				}
			}
		}
		
		//Mostramos el máximo común divisor
		System.out.println("El máximo común divisor es: " + mcd);
		
		//Cerramos scanner
		rd.close();
	}
}

