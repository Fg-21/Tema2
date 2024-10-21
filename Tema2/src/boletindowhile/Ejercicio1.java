package boletindowhile;

public class Ejercicio1 {
	public static void main(String[] args) {
		/*Realiza un programa que muestre por pantalla los 20 primeros 
		 *números naturales (1, 2, 3... 20).*/
		
		//Creamos la variable y la inicializamos en 0 para contar las vueltas del bucle
		int cont = 0;
		
		//Abrimos el bucle hasta que se hayan impeso números del 1 al 20
		do {
			cont++;
			System.out.println(cont);
		} while (cont <20);
	}
}
