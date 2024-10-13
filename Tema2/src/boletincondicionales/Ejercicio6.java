package boletincondicionales;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		/*Dada una hora por teclado, (horas, minutos y segundos) realiza un algoritmo que muestre la hora después de incrementar un segundo.*/
		
        //Creamos la variable de las horas
        int horas;
        
        //Creamos la variable de los minutos
        int minutos;
        
        //Creamos la variable de los segundos
        int segundos;
        
        //Abrimos scanner
        Scanner scanner = new Scanner(System.in);

        //Pedimos la hora al usuario
        System.out.print("Ingrese las horas (0-23): ");
        horas = scanner.nextInt();
        
        //Pedimos los minutos al usuario
        System.out.print("Ingrese los minutos (0-59): ");
        minutos = scanner.nextInt();
        
        //Pedimos los segundos al usuario
        System.out.print("Ingrese los segundos (0-59): ");
        segundos = scanner.nextInt();

        //Añadimos un segundo
        segundos++;

        //Si los segundos se pasan de 60 se añade un minuto
        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }

        //Si los minutos se pasan de 60 se añade una hora
        if (minutos == 60) {
            minutos = 0;
            horas++;
        }

        //Si las horas son 24 se reasigna a 0 la variable
        if (horas == 24) {
            horas = 0;
        }

        //Mostramos la nueva hora
        System.out.printf("La hora después de incrementar un segundo es: " +  horas + ":" + minutos + ":" + segundos);

        //Cerramos el scanner
        scanner.close();
	}
}
