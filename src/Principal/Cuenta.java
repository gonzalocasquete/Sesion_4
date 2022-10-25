package Principal;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	String mNumero;
	String nTitular;
	List<Movimiento> mMovimientos;

	double saldo;
	double limite;

	public Cuenta(String mNumero, String nTitular, double saldo) {
		super();
		this.mNumero = mNumero;
		this.nTitular = nTitular;
		this.saldo = saldo;
		mMovimientos = new ArrayList<>();
		limite=-500;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double x) throws Exception {
		if (x < 0) {
			throw new Exception("El valor no puede ser negativo");
		} else {
			saldo = saldo + x;
			mMovimientos.add(new Movimiento(x, "ingreso"));
		}
	}

	public void retirar(double x) throws Exception {
		if (x < 0) {
			throw new Exception("El valor no puede ser negativo");
		} else {
			if (saldo - x < limite) {
				throw new Exception("Saldo no disponible");
			} else {
				saldo = saldo - x;
				mMovimientos.add(new Movimiento(x, "retiro"));
			}
		}
	}

}
