package br.com.alura.capIII.util;

public class Contador implements Runnable {

	@Override
	public void run() {
		contar();
	}

	private void contar() {
		for (int i = 0; i <= 1000; i++) {
			System.out.println("Thread: " + Thread.currentThread().getId() + " - Número: " + i);
		}
	}

}
