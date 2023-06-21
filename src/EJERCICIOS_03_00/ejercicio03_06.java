package EJERCICIOS_03_00;

import java.util.Scanner;

public class ejercicio03_06 {

	public static void main(String[] args) {
		// Algoritmo que calcule el factorial de un número entero introducido por el usuario. 
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Factorial de un numero");
		System.out.println("Introduce el numero;");
		int num= teclado.nextInt();
				
		double factorial=1;
		for(int i=num; i>1; i--) {
			factorial= factorial*i;
		}
		
		System.out.printf("El factorial es %.2f",factorial);
		
		
	}

}
