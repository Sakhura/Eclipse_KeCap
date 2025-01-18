package Prueba;

import java.util.Vector;

public class VectorTexto {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<>();
		
		vector.add("Java"); //0
		vector.add("Python"); //1
		vector.add("C++"); //2
		vector.add("Kotlin"); //3
		
		String firstElement = vector.get(0);
		System.out.println("Primer elemento: " + firstElement);
		
		System.out.println("Elementos en el vector: ");
		for(String element : vector) {
			System.out.println(element);
		}
		
		vector.remove("C++");
		System.out.println("Elementos despues de eliminar C++: " + vector);
	}

}
