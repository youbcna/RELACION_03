package EJERCICIOS_03_00;

import java.util.Scanner;

public class ejercicio03_13 {

	public static void main(String[] args) {
		// Algoritmo que pida un número natural y determine si es primo o no. 
		
		System.out.println("Programa que calcula si un numero es natural");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero a comprobar");
		int num = teclado.nextInt();
		
		boolean primo = true;
		for(int i=2; i<num; i++) {
			if (num%i==0) {
				primo=false;
			}
		}

		if (primo) System.out.println("El numero es primo");
		else System.out.println("El numero no es primo");
	}

}
