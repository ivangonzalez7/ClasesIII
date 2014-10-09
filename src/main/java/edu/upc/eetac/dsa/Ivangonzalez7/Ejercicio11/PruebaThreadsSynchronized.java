package edu.upc.eetac.dsa.Ivangonzalez7.Ejercicio11;

public class PruebaThreadsSynchronized {
	public static void main(String args[]) {
		CuentaAtrasSynchronized contador1 = new CuentaAtrasSynchronized("ID1",
				4);
		contador1.start();

		CuentaAtrasSynchronized contador2 = new CuentaAtrasSynchronized("ID2",
				7);
		contador2.start();

		CuentaAtrasSynchronized contador3 = new CuentaAtrasSynchronized("ID3",
				8);
		contador3.start();

	}
}