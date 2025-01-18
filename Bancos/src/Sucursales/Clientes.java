package Sucursales;

public class Clientes {

	private String nombre;
	private int monto;
	
	public Clientes(String nom){
		nombre =nom;
		monto= 0;		
	}
	
	public void depositar(int m) {
		monto = monto +m;
	}
	
	public void sacarDinero(int m) {
		monto = monto -m;
	}
	
	public int retornarSaldo() {
		return monto;
	}
	
	public void imprimir() {
		System.out.println(nombre + " tiene de saldo $ " +monto);
	}
}
