package EJERCICIOS_03_00;

import java.util.Scanner;

public class ejercicio03_05 {

	public static void main(String[] args) {
		// Algoritmo  que  sume  los n primeros  números  enteros,  siendo  n  un  número introducido por el usuario. 
		
Scanner teclado = new Scanner (System.in);
		
	System.out.println("Suma de los n primeros numero natruales");
	System.out.println("Introduce el numero");
	int num= teclado.nextInt();
	
	int suma=0;
	for (int i=1; i<num; i++) {
		suma=suma+i;
	}
				
		System.out.printf("La suma es %d",suma);
		
		
	}

}



//hacerlo con un while
/*

int suma=0;
int i=0;
while(i<num) suma=suma+i;
i++;

system.out.printf("La suma es %d", sima);
*/