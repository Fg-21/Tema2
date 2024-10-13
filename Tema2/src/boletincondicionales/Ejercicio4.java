package boletincondicionales;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		/*Escribe un programa que solicite al usuario un número entero entre 1 y 99. El
		 * programa debe mostrarlo con letras, por ejemplo, para 56 se verá: “cincuenta
		 * y seis”.*/

		// Creamos la variable para el número a mostrar en letras
		int numero;

		// Creamos la variable para guardar el número en letras
		String resultado = "";

		// Creamos una variable para guardar las unidades
		int unidad;

		// Creamos una variable para guardar las decenas
		int decena;

		// Abrimos scanner
		Scanner rd = new Scanner(System.in);

		// Pedimos al usuario el número
		System.out.print("Introduce un número entero entre 1 y 99: ");
		numero = rd.nextInt();

		// Comprobamos si el número esta dentro del rango preguntado
		if (numero < 1 || numero > 99) {
			System.out.println("Número fuera de rango. Debe estar entre 1 y 99.");
		} else {

			// Pasamos a letras las unidades y los números que lleguen hasta 19
			switch (numero) {
			case 1 -> {
				resultado = "uno";
			}
			case 2 -> {
				resultado = "dos";
			}
			case 3 -> {
				resultado = "tres";
			}
			case 4 -> {
				resultado = "cuatro";
			}
			case 5 -> {
				resultado = "cinco";
			}
			case 6 -> {
				resultado = "seis";
			}
			case 7 -> {
				resultado = "siete";
			}
			case 8 -> {
				resultado = "ocho";
			}
			case 9 -> {
				resultado = "nueve";
			}
			case 10 -> {
				resultado = "diez";
			}
			case 11 -> {
				resultado = "once";
			}
			case 12 -> {
				resultado = "doce";
			}
			case 13 -> {
				resultado = "trece";
			}
			case 14 -> {
				resultado = "catorce";
			}
			case 15 -> {
				resultado = "quince";
			}
			case 16 -> {
				resultado = "dieciséis";
			}
			case 17 -> {
				resultado = "diecisiete";
			}
			case 18 -> {
				resultado = "dieciocho";
			}
			case 19 -> {
				resultado = "diecinueve";
			}
			}

			// Si el número es mayor o igual a 20, separamos las unidades de las decenas
			if (numero >= 20) {
				decena = numero / 10;
				unidad = numero % 10;

				// Escribimos las decenas
				switch (decena) {
				case 2 -> {
					resultado = "veinte";
				}
				case 3 -> {
					resultado = "treinta";
				}
				case 4 -> {
					resultado = "cuarenta";
				}
				case 5 -> {
					resultado = "cincuenta";
				}
				case 6 -> {
					resultado = "sesenta";
				}
				case 7 -> {
					resultado = "setenta";
				}
				case 8 -> {
					resultado = "ochenta";
				}
				case 9 -> {
					resultado = "noventa";
				}

				}

				// Escribimos las unidades si la unidad no acaba en cero
				if (unidad != 0) {
					resultado += " y ";
					switch (unidad) {
					case 1 -> {
						resultado += "uno";
					}
					case 2 -> {
						resultado += "dos";
					}
					case 3 -> {
						resultado += "tres";
					}
					case 4 -> {
						resultado += "cuatro";
					}
					case 5 -> {
						resultado += "cinco";
					}
					case 6 -> {
						resultado += "seis";
					}
					case 7 -> {
						resultado += "siete";
					}
					case 8 -> {
						resultado += "ocho";
					}
					case 9 -> {
						resultado += "nueve";
					}
					}
				}

				System.out.println("El número en letras es: " + resultado);
			}
		}
		
		// Cerramos scanner
		rd.close();
	}
}
