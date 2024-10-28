package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		/*Escribe un programa que incremente la hora de un reloj. Se pedirán por teclado:
		Hora
		Minutos
		Segundos
		Cantidad de segundos a incrementar
		La aplicación debe mostrar la nueva hora. Por ejemplo, si el usuario introduce hora=13,
		minutos=59 y segundos=51, y se desea incrementar en 10 segundos, el resultado a mostrar 
		es 14:00:01.*/
		
		//Creamos la variable para las horas
		int horas;
		
		//Creamos la variable para los minutos
		int minutos;
		
		//Creamos la variable para los segundos
		int segundos;
		
		//Creamos la varable para la cantidad de segundos a incrementar
		int plusSecs;
		
		//Creamos una cadena para agregar 0 a los numeros sin decenas
		String resul = ""; 
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		
		//Comprobamos que los datos son correctos
		do {
			//Pedimos al usuario la hora
			System.out.println("Introduce la hora");
			horas = rd.nextInt();
		} while (horas < 0 || horas > 24);
		
		do {
			//Pedimos al usuario los minutos
			System.out.println("Introduce los minutos");
			minutos = rd.nextInt();
		} while (minutos < 0 || minutos >59);
		
		do {
			//Pedimos al usuario los segundos
			System.out.println("Introduce los segundos");
			segundos = rd.nextInt();
		} while (segundos < 0 || segundos > 59);
		
		do {	
			//Pedimos al usuario los segundos a incrementar
			System.out.println("Introduce los segundos a incrementar");
			plusSecs = rd.nextInt();
		} while (plusSecs < 0);
		
		//Sumamos los segundos y los segundos añadidos para tener un total
		segundos += plusSecs;
		
		//Gestionamos el desborde de segundos
			for(int cont = 0; cont < plusSecs; cont++) {
				if (segundos + plusSecs >= 60 && segundos > 0) {
					segundos -= 60 ;
					minutos++;
				}
				
				//Gestionamos el desborde de minutos
				if (minutos >= 60) {
					minutos = 0;
					horas++;
				}
					
				//Gestionamos el desborde de horas
				if (horas >= 24) {
					horas = 0;
				}
		}
			
		//Hacemos que se muestre 0X si es un número de una cifra	
		resul += (horas < 10 ? "0" : "") + horas + ":";
		resul += (minutos < 10 ? "0" : "") + minutos + ":";
		resul += (segundos < 10 ? "0" : "") + segundos;
		
		//Mostramos la hora por pantalla
		System.out.println("La hora actual es: " + resul);
		
		//Cerramos scanner
		rd.close();
	}
}