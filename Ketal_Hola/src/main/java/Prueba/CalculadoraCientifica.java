package Prueba;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraCientifica {

	public static void main(String[] args) {
		// teclado pra el ingreso de info
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);// aceptar punto como decimal

		System.out.println("Calculadora Cientifica en Java");
		
		System.out.println("Seleccione una operacion:");
		System.out.println("+, - , * , / , sqrt, sin, cos, tang, log, !, %");
		
		char operacion  = teclado.next().charAt(0);
		double resultado = 0;
		boolean operacionValida = true;
		
		switch(operacion) {
			case '+':
			case '-':
			case '*':
			case '/':
			case '%':
				
			System.out.println("Ingrese primero número: ");
			double num1 = teclado.nextDouble();
			
			System.out.println("Ingrese segundo número: ");
			double num2 = teclado.nextDouble();
		
		
		switch (operacion) {
			case '+': resultado = num1 + num2; break;
			case '-': resultado = num1 - num2; break;
			case '*': resultado = num1 * num2; break;
			case '/': 
				if(num2 != 0) resultado = num1 / num2;
				else {
					System.out.println("Error: División por cero no permitida");
					operacionValida = false;
				}
				break;
			case '%': resultado = num1 % num2; break;
		}
		break;
		
			case '^': //potencia
				System.out.println("Ingrese la base: ");
				double base = teclado.nextDouble();
				System.out.println("ingresar el exponente: ");
				double exponente = teclado.nextDouble();
				resultado = Math.pow(base, exponente);
				break;
			
			case 's':  // Seno
				System.out.println("Ingrese el angulo en grados: ");
				double anguloSeno = Math.toRadians(teclado.nextDouble());
				resultado = Math.sin(anguloSeno);
				break;
				
			case 'c':  // Coseno
				System.out.println("Ingrese el angulo en grados: ");
				double anguloCos = Math.toRadians(teclado.nextDouble());
				resultado = Math.cos(anguloCos);
				break;
			
			case 't':  // Tangente
				System.out.println("Ingrese el angulo en grados: ");
				double anguloTag = Math.toRadians(teclado.nextDouble());
				resultado = Math.tan(anguloTag);
				break;
				
			
			case 'l': //logaritmo natural
				System.out.println("Ingrese un número positivo: ");
				double numLog = teclado.nextDouble();
				if(numLog > 0) {
					resultado = Math.log(numLog);
				} else {
					System.out.println("Error: El logaritmo solo permite números positivos");
					operacionValida = false;
				}
				break;
				
			case '!': //factorial
				System.out.println("Ingrese un número entero: ");
				int numFactorial = teclado.nextInt();
				if(numFactorial >= 0) {
					resultado = calcularFactorial(numFactorial);
				} else {
					System.out.println("Error: solo permite número enteros");
					operacionValida = false;
				}
				break;
			
			case 'q': //raiz cuadrada
				System.out.println("Ingrese un número: ");
				int numRaiz = teclado.nextInt();
				if(numRaiz >= 0) {
					resultado = Math.sqrt(numRaiz);
				} else {
					System.out.println("Error: la raiz no está definida para nros negativos");
					operacionValida = false;
				}
				break;
				
				default:
					System.out.println("Operación no válida");
					operacionValida = false;
		}
				
			if(operacionValida)	 {
				System.out.println("El resultado es: " + resultado);
			}
			
			teclado.close();
			
	}
				
		public static long calcularFactorial(int numero){
			long factorial = 1;
			for (int i = 1; i >= numero; i++) {
				factorial *= i;
			}
			return factorial;
		
				
		
	} // no borrar main

} // no borrar 
