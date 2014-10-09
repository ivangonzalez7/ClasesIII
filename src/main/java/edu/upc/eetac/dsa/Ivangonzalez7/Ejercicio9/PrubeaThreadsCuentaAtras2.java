package edu.upc.eetac.dsa.Ivangonzalez7.Ejercicio9;

public class PrubeaThreadsCuentaAtras2 {

	public static void main(String args[]) {
		CuentaAtras2 contador1 = new CuentaAtras2("ID1", 4);
		// Creamos el Thread y lo ejecutamos
		Thread hilo1 = new Thread(contador1);
		hilo1.start();

		CuentaAtras2 contador2 = new CuentaAtras2("ID2", 7);
		// Creamos el Thread y lo ejecutamos
		Thread hilo2 = new Thread(contador2);
		hilo2.start();

		CuentaAtras2 contador3 = new CuentaAtras2("ID3", 8);
		// Creamos el Thread y lo ejecutamos
		Thread hilo3 = new Thread(contador3);
		hilo3.start();
	}
}
