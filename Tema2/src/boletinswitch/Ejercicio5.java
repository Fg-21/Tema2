package boletinswitch;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		/*Queremos saber, una vez introducida la letra del tipo de carnet de conducir,
		 *se debe imprimir a qué tipo de vehículos corresponde:
		      E: remolques.
		      D: autobuses.
		      C1-C5: camiones.
		      A: motocicletas.
		      B1-B2: automóviles.
		      En caso de introducir uno distinto: “Categoría no contemplada”.*/
		
		//Creamos la variable de la letra del tipo de carnet a introducir por el usuario por teclado
		String ans;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario la letra del carnet
		System.out.println("Introduce la letra del carnet: ");
		System.out.println("Posibles respuestas: ");
		System.out.println("E");
		System.out.println("D");
		System.out.println("C1-C5");
		System.out.println("A");
		System.out.println("B1-B2");
		ans = rd.nextLine();
		
		switch (ans.toUpperCase()) {
		case "E" -> {
			System.out.println("Remolques");
		}
		case "D" -> {
			System.out.println("Autobuses");
		}
		case "C1", "C2", "C3", "C4", "C5" -> {
			System.out.println("Camiones");
		}
		case "A" -> {
			System.out.println("Motocicletas");
		}
		case "B1", "B2" -> {
			System.out.println("Automóviles");
		}
		default ->{
			System.err.println("ERROR DE LECTURA");
		}
		}
		//Cerramos scanner
		rd.close();
	}
}
