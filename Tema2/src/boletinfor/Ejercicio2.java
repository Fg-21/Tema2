package boletinfor;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		/*Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que introducimos por teclado.*/
		
		//Creamos una variable para el número a pedir al usuario
		int num;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario el número
		System.out.println("Introduce un número para contar los múltiplos de 3 desde el 1 hasta el número que introduciste ");
		num = rd.nextInt();
		
		//Contamos los múltiplos de 3 sumando 3 al contador del bucle
		for (int cont = 0; cont <= num; cont +=3) {
			System.out.println(cont);
			
		//Cerramos scanner
		rd.close();
		}
	}
}
