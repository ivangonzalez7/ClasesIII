package edu.upc.eetac.dsa.Ivangonzalez7.Ejercicio9;

public class CuentaAtras2 implements Runnable {

	private String nombre;
	private int s;

	public CuentaAtras2(String nom, int seg) {
		nombre = nom;
		s = seg;
	}

	public void run() {

		while (s >= 0) {

			System.out.println(nombre + " - " + s);

			try {

				Thread.sleep(1000);

			}

			catch (InterruptedException interruptedException) {

				System.out
						.println("First Thread is interrupted when it is  sleeping"
								+ interruptedException);
			}

			s--;

		}
	}
}
