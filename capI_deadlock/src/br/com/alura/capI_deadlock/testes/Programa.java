package br.com.alura.capI_deadlock.testes;

import java.io.File;

public class Programa {

	static File fileI = new File("arquivo1");
	static File fileII = new File("arquivo2");

	public static void main(String[] args) {

		// SE ALTERARMOS A ORDEM DAS INSTÂNCIAS EM QUALQUER UM DOS BLOCOS
		// SYNCRONIZED, TEREMOS UM DEADLOCK

		new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (fileI) {
					System.out.println("Pegou fileI");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (fileII) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Pegou fileII");
					}
				}
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (fileI) {
					System.out.println("Pegou fileI");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (fileII) {
						System.out.println("Pegou fileII");
					}
				}
			}
		}).start();
	}
}
