package EJERCICIOS_03_00;

import java.util.Scanner;

public class ejercicio03_14 {

	public static void main(String[] args) {
		// Algoritmo  que  pida  dos  números  naturales  e  imprimir  su  cociente  entero  por  el método de las restas sucesivas. 
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el dividendo:");
		int dividendo = teclado.nextInt();
		System.out.println("Introduce el divisor");
		int divisor= teclado.nextInt();
		int cociente=0;
		int resto=dividendo;
		while (resto>=divisor) {
			resto = resto -divisor;
			cociente++;
			}
			System.out.printf("%d/%d da %d de cociente y %d de resto", dividendo, divisor, cociente, resto);
		}

	}


