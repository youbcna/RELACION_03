package EJERCICIOS_03_00;

import java.util.Scanner;

public class ejercicio03_08 {

	public static void main(String[] args) {
		//Algoritmo que escriba todos los divisores de un número entero introducido por el usuario.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculo de divisores de un numero");
		System.out.println("Introduce el numero a calcular");
		int num= teclado.nextInt();
		String divisores1= " ", divisores2=" ";
		
		for (int i=1; i<num/i; i++) {
			if(num%i==0) {
				divisores1= divisores1+ " "+ i;
				divisores2 = num/i + " "+ divisores2;
			}
		}
System.out.printf("los divisores son %s", divisores1 + " "+divisores2);
	}

}
