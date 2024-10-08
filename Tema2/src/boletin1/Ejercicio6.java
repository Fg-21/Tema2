package boletin1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		//Creamos las variables de los los coeficientes
		double coeficienteA;
		double coeficienteB;
		double coeficienteC;
		double discriminante;
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos los coeficientes por teclado
		System.out.println("Introduce el valor del coeficiente a");
		coeficienteA = rd.nextDouble();
		System.out.println("Introduce el valor del coeficiente b");
		coeficienteB = rd.nextDouble();
		System.out.println("Introduce el valor del coeficiente c");
		coeficienteC = rd.nextDouble();
		
		//Calculamos el discriminante para saber el Nº de soliciones de la ecuación
		discriminante = coeficienteB * coeficienteB -4 * coeficienteA * coeficienteC;
		
		//Depende del discriminante, nuestra ecuacion tendrá 0, 1 o 2 soluciones
		if (discriminante < 0) {
			System.out.println("No hay solución");
		}
		else if (coeficienteA==0) {
			System.out.println("Solo hay una solución, ecuación de primer grado: " + (-coeficienteC/coeficienteB));
		}
		else if (discriminante == 0) {
			System.out.println("Solo hay una solución: " + (-coeficienteB-Math.sqrt(discriminante)/(2*coeficienteA)));
		}
		else if (discriminante > 0) {
			System.out.println("Hay 2 soluciones");
			System.out.println("Solución 1: " + (-coeficienteB-Math.sqrt(discriminante)/(2*coeficienteA)));
			System.out.println("Solución 2: " + (-coeficienteB+Math.sqrt(discriminante)/(2*coeficienteA)));
		}
		
		//Cerramos scanner
		rd.close();
	}
}
