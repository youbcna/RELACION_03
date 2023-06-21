package EJERCICIOS_03_00;

import java.util.Scanner;

public class ejercicio03_04 {

	public static void main(String[] args) {
		// Algoritmo  que  escriba  los  números  impares  comprendidos  entre  dos  enteros introducidos por el usuario.

		
Scanner teclado = new Scanner (System.in);
		
		int num1;
		int num2;
		
		System.out.println("Numeros impares comprendidos entre dos numeros");
		System.out.println("Introduce el primero");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo");
		num2 = teclado.nextInt();
		
		if(num1%2==0) num1++;
		System.out.println("Desde el numero: " + num1 + " al " + num2 + " se comprenden los impares: " );
		for(int i=num1; i<num2;i=i+2)
			System.out.println(i);
		
		
		teclado.close();
	
	}

}
