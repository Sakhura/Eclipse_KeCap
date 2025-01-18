package Sucursales;

public class Bancos {
	
	private Clientes cliente1, cliente2, cliente3;
	
	public Bancos() {
		cliente1= new Clientes("Pedro");
		cliente2= new Clientes("Juan");
		cliente3= new Clientes("Diego");
			
	}
	
	public void operar() {
		cliente1.depositar(100000);
		cliente2.depositar(200000);
		cliente3.depositar(1000000);
		cliente3.sacarDinero(950000);
	}
	
	public void depositosTotales() {
		int t =cliente1.retornarSaldo() + cliente2.retornarSaldo() + cliente3.retornarSaldo();
		System.out.println("El total de dinero en el Banco es: $ " + t);
		cliente1.imprimir();
		cliente2.imprimir();
		cliente3.imprimir();
	}
	
	public static void main(String[] arg) {
		Bancos banco1= new Bancos();
		banco1.operar();
		banco1.depositosTotales();
	}
	
	

}
