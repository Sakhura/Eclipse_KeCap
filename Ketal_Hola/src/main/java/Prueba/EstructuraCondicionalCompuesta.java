package Prueba;

import java.util.Scanner;

// tengo dos opciones, pero debo tomar una decision 
public class EstructuraCondicionalCompuesta {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Ingresar el primer número");
		num1 = teclado.nextInt(); 
		
		System.out.println("Ingresar el segundo número");
		num2 = teclado.nextInt(); 
			
		if(num1 > num2) {
			System.out.println("El nro: " + num1 + " es mayor");
		} else {
			System.out.println("El nro: " + num2 + " es mayor");
		}

	}

}
