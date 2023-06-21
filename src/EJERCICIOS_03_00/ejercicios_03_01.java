package EJERCICIOS_03_00;

import java.util.Scanner;

public class ejercicios_03_01 {

	public static void main(String[] args) {
		// Algoritmo  que  imprima  la  tabla  de  multiplicar  correspondiente  a  un  número comprendido entre uno y diez, 
		// introducido por el usuario, usando un esquema for. 
		
Scanner teclado = new Scanner(System.in);
		
		int num1;
		int result;
		System.out.println("Introduce un numero");
		num1 = teclado.nextInt();
		
		for(int x=0; x<=10; x++) {
			result = x * num1;
			System.out.println(" "+num1+ " x "+ x + " = "+ result);
		}
teclado.close();
	}

}
