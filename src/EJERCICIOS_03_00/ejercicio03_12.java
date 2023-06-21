package EJERCICIOS_03_00;

import java.util.Scanner;

public class ejercicio03_12 {
	public static void main(String[] args) {
		// Algoritmo que determine si un número entero dado es perfecto o no. Se dice que un número es perfecto cuando es igual 
		// a la suma de sus divisores, excluido él mismo. Por ejemplo 6 es perfecto, ya que 6 = 1 + 2 + 3
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculo numero perfecto");
		
		System.out.println("Introduce un numero: ");
		int num= teclado.nextInt();
		
		int suma=0;
		for ( int i=2;i<num;i++) {
			if(num%i==0) {
				suma=suma+i;
			}
		}
		if(suma==num)
			System.out.printf("El numero %d es perfecto", num);
		else
			System.out.printf("El numero %d NO es perfecto",num);
	}

}
