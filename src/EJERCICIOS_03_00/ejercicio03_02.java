package EJERCICIOS_03_00;

import java.util.Scanner;

public class ejercicio03_02 {

	public static void main(String[] args) {
		// Algoritmo  que  imprima  la  tabla  de  multiplicar  correspondiente  a  un  número comprendido  entre  uno  y  diez, 
		// introducido  por  el  usuario,  usando  un  esquema while. 
		
		
		Scanner teclado = new Scanner (System.in);
		
		int num1;
		int result;
		
		System.out.println("Introduce un numero");
		num1 = teclado.nextInt();
		int x=0;
		while(x<=10) {
			result= num1*x;
			System.out.println(" "+num1+ " x "+ x + " = "+ result);
			x++;
			
		}
		teclado.close();
			
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
