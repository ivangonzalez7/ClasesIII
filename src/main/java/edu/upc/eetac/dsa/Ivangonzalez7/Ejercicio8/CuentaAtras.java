package edu.upc.eetac.dsa.Ivangonzalez7.Ejercicio8;

public class CuentaAtras extends Thread {

	private String nombre;
	private int s;
	private static String IDanterior;
	private static String IDactual = "Es el primer thread";
	static int cont = 3;

	public CuentaAtras(String nom, int seg) {
		this.nombre = nom;
		this.s = seg;
	}

	private static void ultimaEscritura(String thread) {
		String valor;
		valor = thread;
		IDanterior = IDactual;
		IDactual = valor;
	}

	public void run() {

		while (s >= 0) {

			ultimaEscritura(nombre);

			if (s == 0)

			{
				cont--;

				System.out.println(nombre + " - " + s + " - ultima escritura "
						+ IDanterior);

				System.out.println("ultima escritura " + nombre + " - " + cont
						+ "  Threads activos");

			}

			else {

				System.out.println(nombre + " - " + s + " - ultima escritura "
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
			s--;

		}

	}
}