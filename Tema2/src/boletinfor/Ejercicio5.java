package boletinfor;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		/*Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se denota 5! 
		 *y es igual a 5x4x3x2x1 = 120.*/
		
		//Creamos la variable para el número a pedir al usuario
		int num;
		
		
		//Creamos la variable para guardar el factorial
		int facts = 1;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario el número
		System.out.println("Introduce el número para calcular su factorial");
		num = rd.nextInt();
		
		//Creamos un bucle para calcuar el factorial
		for (int cont = num; cont >= 1; cont--) {
			facts *= cont;
			
		}
		//Mostramos el factorial
		System.out.println(facts);
		
		//Cerramos scanner
		rd.close();
	}
}
