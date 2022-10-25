package Principal;

import java.util.List;

public class Cuenta {
	  String mNumero; 
      String nTitular; 
      List <Movimiento> mMovimientos;
      
      double saldo;

	public Cuenta(String mNumero, String nTitular, double saldo) {
		super();
		this.mNumero = mNumero;
		this.nTitular = nTitular;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double x) {
		setSaldo(100);
		
	}
	
	public void retirar(double x) {
		setSaldo(0);
	}
         
}
