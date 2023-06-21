package EJERCICIOS_03_00;

import java.util.Scanner;

public class ejercicio03_07 {

	public static void main(String[] args) {
		// Algoritmo  que  cuente  cuántos  múltiplos  de  7  hay  entre  dos  enteros  dados  por  el usuario.

		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cuenta de multiplos de 7 entre 2 numeros");
		
		System.out.println("Introduce el primer numero");
		int inicio= teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		int fin = teclado.nextInt();
		
		int contador=0;
		for (int i=inicio; i<=fin; i++) {
			if (i%7==0) {
				contador++;
			}
		}
		
		
		
		
		
		System.out.printf("Hay %d divisores de 7 entre %d y %d", contador, inicio, fin);
		
	}

}
