package Prueba;

import java.util.Scanner;

//n colaboradores, sueldo entre 100 y 500 

public class EstructuraWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n, x, conta1, conta2;
		float sueldo, gastos;
		
		System.out.println("¿Cuántos colaboradores tiene la empresa?");
		n=teclado.nextInt();
		x=1;
		conta1= 0;
		conta2= 0;
		gastos= 0;
		
		while (x<=n) {
			System.out.println("Ingrese el sueldo del colaborador:$ ");
			sueldo= teclado.nextFloat();
			
			if(sueldo<=300 ) {
				conta1 = conta1 +1;
			} else {
				conta2 = conta2 +1;
				
			}
			gastos = gastos + sueldo;
			x=x +1;
		}
		
		System.out.println("Cantidad de colaboradores con sueldos entre 100 y 300 son : ");
		System.out.println(conta1);
		
		System.out.println("Cantidad de colaboradores con sueldos mayor a 300 son : ");
		System.out.println(conta2);
		
		System.out.println("Gastos total de la empresa en sueldos ");
		System.out.println(gastos);
		
		
	}
}
