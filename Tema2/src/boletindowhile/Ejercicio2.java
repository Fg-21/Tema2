package boletindowhile;

public class Ejercicio2 {
	public static void main(String[] args) {
		/*Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.*/
		
		//Creamos una varibale para contar números de 2 en 2 y lo inicializamos en 2
		int cont2 = 2;
		
		//Abrimos el bucle sumando números de 2 en 2 hasta 200
		
		do {
			System.out.println(cont2);
			cont2 += 2;
		} while (cont2 <= 200);
	}
}
