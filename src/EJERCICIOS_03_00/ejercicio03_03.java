package EJERCICIOS_03_00;

import java.util.Scanner;

public class ejercicio03_03 {

	public static void main(String[] args) {
		// Algoritmo  que  imprima  la  tabla  de  multiplicar  correspondiente  a  un  número comprendido entre uno y diez, 
		// introducido por el usuario, usando un esquema do while. 
		// Nota: En los tres ejercicios anteriores, el programa ha de controlar mediante un esquema do-while, que el número está 
		//       comprendido entre 1 y 10.
	
	Scanner teclado = new Scanner (System.in);
		
		int num1;
		int result;
		int x=0;
		System.out.println("Introduce un numero");
		num1 = teclado.nextInt();
		
		do {
			result = num1 * x;
			System.out.println(" "+num1+ " x "+ x + " = "+ result);
			x++;	
		
		} while (x<=10);
	
		
		
		
		
		
		
		teclado.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
