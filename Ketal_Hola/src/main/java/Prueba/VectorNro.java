package Prueba;

import java.util.Scanner;

public class VectorNro {
		
	private Scanner teclado; 
	private int[] sueldos;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		sueldos = new int[5];
		for(int i=0; i<5;i++) {
			System.out.println("Ingrese valor del sueldo");
			sueldos[i]= teclado.nextInt();
		}
	}
	
	public void imprimir() {
		for(int i=0; i<5;i++) {
			System.out.println(sueldos[i]);
		}
	}
	
	
	public static void main(String[] args) {
		VectorNro vn = new VectorNro();
		vn.cargar();
		vn.imprimir();
	}

}
