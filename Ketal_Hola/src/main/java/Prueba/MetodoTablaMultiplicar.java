package Prueba;

import java.util.Scanner;

public class MetodoTablaMultiplicar {

	public void cargarNro() {
		Scanner teclado= new Scanner(System.in);
		int nro;
			
			do {
				System.out.println("Ingrese el Nro: ");
				nro = teclado.nextInt();
				if (nro !=-1) {
					calcular(nro);
				}
			
			} while (nro!=-1);
	}
	
	public void calcular(int n) {
		for( int f=n; f<=n*10; f=f+n) {
			System.out.print(f+"-");
		}
	}
	
	
	public static void main(String[] args) {
		MetodoTablaMultiplicar tabla;
		tabla = new MetodoTablaMultiplicar();
		tabla.cargarNro();

	}

}
