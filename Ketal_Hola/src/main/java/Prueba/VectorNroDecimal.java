package Prueba;

import java.util.Scanner;

// 5 personas con su estatura mts 1.60
public class VectorNroDecimal {

	private Scanner teclado;
	private float[] alturas;
	private float promedio;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		alturas = new float[3];
		for(int i=0; i<3; i++) {
			System.out.println("Ingrese la altura de la persona: ");
			alturas[i]= teclado.nextFloat();
		}
	}
	
	public void promedio() {
		float suma;
		suma= 0;
		for(int i=0; i<3; i++) {
			suma= suma+alturas[i];
		}
		promedio = suma/3;
		System.out.println("Promedio de las alturas es: "+ promedio );
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		VectorNroDecimal vnd = new VectorNroDecimal();
		vnd.cargar();
		vnd.promedio();

	}

}
