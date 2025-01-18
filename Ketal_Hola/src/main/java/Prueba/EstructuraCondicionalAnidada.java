package Prueba;

import java.util.Scanner;

public class EstructuraCondicionalAnidada {
	
	 public static void main(String[] ar) {
		 
		 Scanner teclado = new Scanner(System.in);
	     int nota1, nota2, nota3;
		 
	     System.out.print("Ingrese primer nota: ");
	     nota1 = teclado.nextInt();
	     
	     System.out.print("Ingrese segunda nota: ");
	     nota2 = teclado.nextInt();
	     
	     System.out.print("Ingrese tercer nota: ");
	     nota3 = teclado.nextInt();
	     
	     int promedio = (nota1 + nota2 + nota3) / 3;
	     
	     if (promedio >= 7) {
	            System.out.println("Eres el mejor");
	        } else if (promedio >= 5 && promedio < 7) {
	            System.out.println("Buen alumno");
	        } else if (promedio >= 4 && promedio < 5) {
	            System.out.println("Pasaste");
	        } else {
	            System.out.println("Reprobado");
	        }
	     
	 }
	
}

	