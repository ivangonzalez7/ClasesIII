package edu.upc.eetac.dsa.Ivangonzalez7.Ejercicio8;

public class PruebaThreads {
	public static void main(String args[]) {
		CuentaAtras contador1 = new CuentaAtras("ID1", 4);
		contador1.start();

		CuentaAtras contador2 = new CuentaAtras("ID2", 7);
		contador2.start();

		CuentaAtras contador3 = new CuentaAtras("ID3", 8);
		contador3.start();

	}
}