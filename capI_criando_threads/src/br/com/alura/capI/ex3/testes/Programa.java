package br.com.alura.capI.ex3.testes;

import br.com.alura.capI.ex3.runnables.PrinterDeMsg;

public class Programa {

	public static void main(String[] args) {

		Runnable runnableI = new PrinterDeMsg("Olá");
		Runnable runnableII = new PrinterDeMsg("Opa");

		Thread threadI = new Thread(runnableI);
		Thread threadII = new Thread(runnableII);

		threadI.start();
		threadII.start();
	}
}
