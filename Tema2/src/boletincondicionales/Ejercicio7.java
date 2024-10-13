package boletincondicionales;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		/*Determinar el precio de un billete de tren, conociendo la distancia a recorrer, 
		 *y sabiendo que si el número de días de estancia es superior a 7 y la distancia superior a 800 km el billete tiene una reducción del 30%. 
		 *El precio por kilómetro es de 2,5€. La distancia a recorrer y el número de días de estancia los debes solicitar al usuario por teclado*/
		
        //Definimos constante del precio por km
        final double PRECIO_POR_KM = 2.5;
        
        //Definimos constante de la distancia para reducción
        final int DISTANCIA_REDUCCION = 800;

        //Definimos constante de los dias para la reducción
        final int DIAS_REDUCCION = 7;
        
        //Definimos constante de la reducción
        final double REDUCCION = 0.30;
        
        //Creamos la variable de la distancia a recorrer
        double dist;
        
        //Creamos la variable para los dias de estacia
        int diasEstancia;
        
        //Creamos la variable para el precio base
        double precioBase;

        Scanner rd = new Scanner(System.in);

        //Solicitamos la distancia a recorrer y el número de días de estancia
        System.out.print("Introduce la distancia a recorrer (en km): ");
        dist = rd.nextDouble();
        
        //Solicitamos el número de días de estancia        
        System.out.print("Introduce el número de días de estancia: ");
        diasEstancia = rd.nextInt();

        //Calculamos el precio inicial
        precioBase = dist * PRECIO_POR_KM;

        //Comprobamos si hay que aplicar la reducción o no
        if (dist > DISTANCIA_REDUCCION && diasEstancia > DIAS_REDUCCION) {
            System.out.println("El precio del billete es de: " + (precioBase-precioBase*REDUCCION) + " aplicando la reducción");
        } else {
            System.out.println("El precio del billete es de: " + precioBase);
        }
        
        //Cerramos scanner
        rd.close();
	}
}
