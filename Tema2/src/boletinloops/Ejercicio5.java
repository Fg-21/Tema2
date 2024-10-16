package boletinloops;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		/*Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos
		 *de un centro educativo. Se introducirán datos hasta que uno de ellos sea negativo, 
		 *y se mostrará: la suma de todas las edades introducidas, la media, el número de alumnos
		 *y cuántos son mayores de edad.-*/
		
		//Creamos la varibale para la edad
		int age = 0;
		
		//Creamos la variable para guardar la suma de las edades
		int suma = 0;
		
		//Creamos la variable para contar el número de alumnos
		double cont = 0;
		
		//Creamos la variable para guardar a los mayores de edad
		int mayor = 0;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos que introduzca la edad
		System.out.println("Introduce la edad");
		age = rd.nextInt();
		
		//Mientras que no se ponga un número negativo en la edad se harán estas operaciones
		while (age > 0) {
			suma += age;	
			cont++;
			if (age >= 18) {
				mayor++;
			}
			System.out.println("Introduce la edad");
			age = rd.nextInt();
		}
		
		//Creamos la variable para la media
		double media = suma/cont;
		
		//Mostramos por pantalla la suma de edades
		System.out.println("Suma de edades: " + suma);
		
		//Mostramos el número de alumnos
		System.out.println("Nº de alumnos :" + cont);
		
		//Mostramos la media de las edades
		System.out.println("Media de edad de alumnos :" + media);
		
		//Mostramos los mayores de edad
		System.out.println("Alumnos mayores de edad: " + mayor);
		
		//Cerramos scanner
		rd.close();
	}
}
