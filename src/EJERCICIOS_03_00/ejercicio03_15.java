package EJERCICIOS_03_00;

import java.util.Scanner;

public class ejercicio03_15 {

	public static void main(String[] args) {
		// Implementar el ejercicio 7 de la práctica 2, introduciendo un esquema do-while, de forma que el usuariodecida 
		// cuando quiere salir del programa. 

		Scanner teclado = new Scanner(System.in);

		double num1;
		double num2;

		System.out.print("Introduce un numero ");
		num1 = teclado.nextDouble();
		System.out.print("Introduce otro numero ");
		num2 = teclado.nextDouble();
	
	int seleccionado=0;	
	
	System.out.println("\nPosibles calculos:");
do {
	System.out.println("0. EXIT");
	System.out.println("1. Sumar");
	System.out.println("2. Restar");
	System.out.println("3. Multiplicar");
	System.out.println("4. Dividir");
	System.out.println("5. Raiz cuadrada");
	System.out.println("6. Exponencial del primero al segundo");
	
	
	System.out.println("\nIntroduce que calculo quieres realiar");
	seleccionado = teclado.nextInt();
	double res=0;
	switch (seleccionado) {
	case 0: 
		System.out.println("Hasta luego");;
		return;
	case 1: 
		res= num1+num2;
		break;
	case 2:
		res= num1 - num2;
		break;
	case 3: 
		res= num1*num2;
		break;
	case 4:
		res= num1/num2;
		break;
	case 5: 
		res= Math.sqrt(num1);
		break;
	case 6: 
		res= Math.pow(num2, num1);
		break;
	default: 
		System.out.println("Opcion incorrecta");
		break;
	}
	
	System.out.println("\nEl resultado es: "+ res);

} while  (seleccionado!=0);
		
	teclado.close();
		
		
		
	}

}
