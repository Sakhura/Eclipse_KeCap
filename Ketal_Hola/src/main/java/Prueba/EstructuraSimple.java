package Prueba;
/*Las estructuras simples son tomas de decisiones de verdadero o falso*/
import java.util.Scanner;

public class EstructuraSimple {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int sueldo;
		
		System.out.println("Ingrese el sueldo");
		sueldo = teclado.nextInt();
		
		if (sueldo > 908469) {
			System.out.println("Esta persona si paga impuesto");
		}
		
	}

}
