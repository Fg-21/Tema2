package boletincondicionales;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		/*Realiza el “juego de la suma”, que consiste en que aparezcan dos números aleatorios (comprendidos entre 1 y 99) y el usuario tiene que sumarlos. 
		 *La aplicación le pedirá al usuario que introduzca el resultado de la suma. 
		 *La aplicación le indicará si el resultado es correcto o no.*/
		
		//Creamos la varibale del primer número aleatorio
		int numero1;
		
		//Creamos la varibale del segundo número aleatorio
		int numero2;
		
		//Creamos la variable para la respuesta del usuario
		int respuestaUsuario;
		
		//Creamos la variable para la respuesta correcta
		int ans;
		
		//Abrimos el scanner
		Scanner scanner = new Scanner(System.in);

        //Generamos dos números aleatorios entre 1 y 99 
        numero1 = (int)(Math.random() * 99) + 1; 
        numero2 = (int)(Math.random() * 99) + 1;

        //Preguntamos la operación al usuario y le pedimos que conteste
        System.out.println("¿Cuánto es " + numero1 + " + " + numero2 + "?");
        respuestaUsuario = scanner.nextInt();

        //Calculamos la respuesta correcta
        ans = numero1 + numero2;

        //Verificamos si la respuesta del usuario es correcta
        if (respuestaUsuario == ans) {
            System.out.println("¡Correcto! La suma es " + ans + ".");
        } else {
            System.out.println("Incorrecto. La suma correcta es " + ans + ".");
        }

        //Cerramos scanner
        scanner.close();
	}
}
