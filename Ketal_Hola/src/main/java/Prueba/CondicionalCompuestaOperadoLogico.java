package Prueba;

import java.util.Scanner;

public class CondicionalCompuestaOperadoLogico {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int dia, mes , anio;
		
		System.out.println("Ingrese el nro del día: ");
		dia = teclado.nextInt();
		
		System.out.println("Ingrese el nro del mes: ");
		mes = teclado.nextInt();
		
		System.out.println("Ingrese el nro del año: ");
		anio = teclado.nextInt();
		
		if ( mes==12 || dia==25) {
			System.out.println(" La fecha podria ser navidad");
		} else {
			System.out.println("No es navidad");
		}

	}

}
