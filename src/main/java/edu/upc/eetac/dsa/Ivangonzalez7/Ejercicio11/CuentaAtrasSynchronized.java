package edu.upc.eetac.dsa.Ivangonzalez7.Ejercicio11;

public class CuentaAtrasSynchronized extends Thread {

	private String nombre;
	private int s;
	private static String IDanterior;
	private static String IDactual = "Es el primer thread";
	static int cont = 3;

	public CuentaAtrasSynchronized(String nom, int seg) {
		this.nombre = nom;
		this.s = seg;
	}

	private synchronized void ultimaEscritura(String thread) {
		synchronized (this) {
			IDanterior = IDactual;
			IDactual = thread;
		}

	}

	public void run() {

		ultimaEscritura(nombre);
		while (s >= 0) {

			if (s == 0)

			{

				cont--;

				System.out.println(nombre + " - " + s + " - ultima escritura"
						+ IDanterior);

				System.out.println("ultima escritura " + nombre + " - " + cont
						+ "  Threads activos");

			}

			else {

				System.out.println(nombre + " - " + s + " - ultima escritura"
						+ IDanterior);

			}

			try {

				Thread.sleep(1000);

			}

			catch (InterruptedException interruptedException) {

				System.out
						.println("First Thread is interrupted when it is  sleeping"
								+ interruptedException);
			}

			ultimaEscritura(nombre);
			s--;

		}

	}
}