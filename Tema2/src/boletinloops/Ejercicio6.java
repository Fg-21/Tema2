package boletinloops;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		/*Un centro de investigación de la flora urbana necesita una aplicación que muestre
		 *cuál es el árbol más alto. Para ello se introducirá por teclado la altura (en centímetros) 
		 *de cada árbol (terminando la introducción de datos cuando se utilice -1 como altura). 
		 *La aplicación debe devolver la altura del árbol más alto.*/
		
		//Creamos la variable para la altura del árbol
		int height;
		
		//Creamos la variable para la altura del arbol más alto
		int maxHeight = 0;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario la altura del primer árbol
		System.out.println("Introduce la altura del árbol");
		height = rd.nextInt();
		
		//Repetimos la operación guardando la altura mas grande hasta que se introduzca -1
		while (height != -1) {
			if (height > maxHeight) {
				maxHeight = height;
			}
			System.out.println("Introduce la altura del árbol");
			height = rd.nextInt();
		}
		
		//Mostramos la altura del árbol más alto
		System.out.println("El árbol más alto es el que mide: " + maxHeight);
		
		//Cerramos scanner
		rd.close();
	}
}
