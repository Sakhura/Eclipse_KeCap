package Prueba;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	// Calculadora básica + - * /
	public static void main(String[] args) {
		// teclado pra el ingreso de info
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);// aceptar punto como decimal

			// titulo
		System.out.println("Calculadora en Java");
	
			// el ingreso de datos numericos
		System.out.println("Ingrese el primer número: ");
		double num1 = teclado.nextDouble();
		
		System.out.println("Ingrese el segundo número: ");
		double num2 = teclado.nextDouble();
		
			// escoger operacion + - * /
		
		System.out.println("Seleccione una operacion");
		char operacion = teclado.next().charAt(0);
		
		double resultado = 0;
		boolean operacionValida = true;
		
		switch (operacion) {
			case '+':
				resultado = num1 + num2;
			break;
			
			case '-':
				resultado = num1 - num2;
			break;
			
			case '*':
				resultado = num1 * num2;
			break;
			
			case '/':
				if( num2 != 0) {
					resultado = num1 / num2;
				} else {
					System.out.println("Error: División por cero no permitida");
					operacionValida = false;
				}
				break;
			default:
				System.out.println("Operación no válida");
				operacionValida = false;
									
		}
		
		if(operacionValida) {
			System.out.println("El resultado es: " + resultado);
		}
		
		teclado.close();
		
	}

}
