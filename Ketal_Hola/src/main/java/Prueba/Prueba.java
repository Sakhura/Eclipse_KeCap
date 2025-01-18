package Prueba;

import java.util.Scanner;

// superficie de un cuadrado lado * lado
public class Prueba {
	
	public static void main(String[] args) {
		//ingresar datos por teclado
		Scanner teclado = new Scanner(System.in);
		int lado;
		int superficie;
		System.out.print("Ingresar el valor del lado del cuadrado");
		lado = teclado.nextInt();
		superficie = lado * lado;
		System.out.print("La superficie del cuadrado es: ");
		System.out.print(superficie);
	}
	
}
