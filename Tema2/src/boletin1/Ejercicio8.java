package boletin1;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		/*Escribir una aplicación que pida al usuario un número real y 
		 * muestre por pantalla la nota del alumno, teniendo en cuenta:
		 * 
		[0-5) es INSUFICIENTE (0 inclusive)
		[5-6) es SUFICIENTE (5 inclusive)
		[6-7) es BIEN (6 inclusive)
		[7-9) es NOTABLE (7 inclusive)
		[9-10] es SOBRESALIENTE (9 y 10 inclusives)*/
		
		//Creamos la variable de la nota del usuario
		double nota;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos la nota el usuario
		System.out.println("Introduce tu nota");
		nota = rd.nextDouble();
		
		/*Ajustamos los intervalos para dar al usuario su calificación estableciendo
		los condicionales en estos*/
		if (nota>=0 && nota <=10) {
			if (nota>=0 && nota<5) {
				System.out.println("INSUFICIENTE");
			}
			else if (nota>=5 && nota<6) {
				System.out.println("SUFICIENTE");
			}
			else if (nota>=6 && nota<7) {
				System.out.println("BIEN");
			}
			else if (nota>=7 && nota<8) {
				System.out.println("NOTABLE");
			}
			else if (nota>=9 && nota<=10) {
				System.out.println("SOBRESALIENTE");
			}

		}
		else {
			System.out.println("Nota errónea, no está entre 0 y 10");
		}
		
		//Cerramos scanner
		rd.close();
	}
}
