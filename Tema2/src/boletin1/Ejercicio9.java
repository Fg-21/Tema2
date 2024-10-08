package boletin1;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		/*Escribir un programa que simule el juego de PIEDRA, PAPEL, TIJERA,
		 *pidiendo a cada jugador que escriba PIEDRA, PAPEL o TIJERA. 
		 *El juego debe mostrar por pantalla quién ha ganado el juego 
		 *tras jugar una partida. Hay que contemplar el caso de que empaten.*/
		
		//Creamos las variables de las respuestas de los dos jugadores
		String player1;
		String player2;
		
		//Creamos las variable para las opciones del juego
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERA = "TIJERA";
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos elegir entre PIEDRA, PAPEL o TIJERA a cada uno de los jugadores
		System.out.println("P1, Introduzca PIEDRA, PAPEL O TIJERA  para jugar");
		player1 = rd.nextLine();
		
		System.out.println("P2, Introduzca PIEDRA, PAPEL O TIJERA  para jugar");
		player2 = rd.nextLine();
		
		/*Comprobamos que ha escrito bien su elección, después,
		 *decidimos quien gana o si es empate*/
		
		if (player1.equals(player2)) {
			System.out.println("EMPATE");
			} 
		else if (player1.equalsIgnoreCase(PIEDRA) && player2.equals(TIJERA) ||
				 player1.equalsIgnoreCase(TIJERA) && player2.equals(PAPEL) ||
				 player1.equalsIgnoreCase(PAPEL) && player2.equals(PIEDRA)) {
			System.out.println("GANA P1");
		}
		else  {
			System.out.println("GANA P2");
		}

		
		//Cerramos scanner
		rd.close();
	}
}
