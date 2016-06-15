package br.com.alura.capV.testes;

public class Programa implements Runnable {

	static int numero;

	public static void main(String[] args) throws InterruptedException {
		Thread threadI = new Thread(new Programa());
		Thread threadII = new Thread(new Programa());

		threadI.start();
		threadII.start();

		imprime();
	}

	@Override
	public void run() {
		synchronized (Programa.class) {
			numero += 10;
			Programa.class.notify();
		}
	}

	public synchronized static void imprime() throws InterruptedException {
		if (numero != 20) {
			Programa.class.wait();
		}

		System.out.println(numero);
	}
}
