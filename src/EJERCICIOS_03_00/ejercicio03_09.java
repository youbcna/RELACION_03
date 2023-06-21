package EJERCICIOS_03_00;

public class ejercicio03_09 {

	public static void main(String[] args) {
		// Algoritmo que escriba la tabla de multiplicar usando esquemas for.
		
		for (int tabla=1; tabla<=10; tabla++) {
			for(int i=1; i<=10; i++) {
				System.out.printf("%dx%d=%d\t\t", tabla, i, tabla*i);
			}
			System.out.println();
		}

	}

}
