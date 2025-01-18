package Prueba;

import java.util.Scanner;

//clase 
public class SueldoOperario { 

	// clase  main , sin esta clase no funciona
	public static void main(String[] args) {
		
		//teclado ingresar datos, nros, texto etc
		Scanner teclado = new Scanner(System.in);
		
		// variables horasTrabajadas, costoHora, sueldo
		int horasTrabajadas = 0;
		float costoHora = 0 ;
		float sueldo ;
	
		
		System.out.println("Ingresar las horas trabajadas por el colaborador: ");
		horasTrabajadas = teclado.nextInt();
		
		System.out.println("Ingresar el valor de las horas trabajadas del colaborador: ");
		costoHora = teclado.nextFloat();
		
		sueldo = horasTrabajadas * costoHora;
		
		System.out.printf("El sueldo a pagar del colaborador es : $ %.2f%n", sueldo)  ;
		
		teclado.close();
	}
}
