package boletinfor;

public class Ejercicio4 {
	public static void main(String[] args) {
		/*Diseñar un programa que muestre la suma de los 10 primeros números impares.*/
		
		//Creamos la variable para almacenar la suma de los números impares hasta 10
		int suma = 0;
		
		//Creamos el bucle con contador a 1 para ir sumando de 2 en 2 y ser asi siempre par
		for (int cont = 1; cont < 10; cont += 2) {
			suma += cont;
		}
		
		//Mostramos la suma
		System.out.println("La suma total es de: " + suma);
	}
}
