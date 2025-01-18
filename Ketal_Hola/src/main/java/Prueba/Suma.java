package Prueba;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		int num1, num2, suma, producto;
		
		System.out.println("ingrese el primer nro: ");
		num1 = teclado.nextInt();
		
		System.out.println("ingrese el segundo nro: ");
		num2 = teclado.nextInt();
		
		suma = num1 + num2;
		
		producto = num1 * num2;
		
		System.out.println("La suma de los números es: ");
		System.out.println(suma);
		
		System.out.println("El producto (multiplicación) de los números es: ");
		System.out.println(producto);
		
	}
	
}
