package boletindowhile;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		/*Realiza un programa que sume los números desde el 1 hasta un número N 
		 *que se introducirá por teclado. Si el usuario introduce un 5, 
		 *el programa debe devolver la suma de 1+2+3+4+5. */
		
		//Creamos la varibale para guardar el número que pedimos al usuario
		int num;
		
		//Creamos la variable para contar las vueltas del bucle y la inicializamos en 0
		int cont = 0;
		
		//Creamos la variable para guardar el total de la suma y la inicializamos a 0
		int suma = 0;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario el número
		System.out.println("Introduce el número para sumar todos los que hay entre el tuyo y 1");
		num = rd.nextInt();
		
		//Abrimos el bucle para sumar los números desde el 1 hasta el número del usuario
		do {
			cont++;
			suma += cont;
		} while (cont < num);
		
		//Imprimimos la suma total por pantalla
		System.out.println("La suma total es de: " + suma);
		
		//Cerramos scanner
		rd.close();
	}
}
