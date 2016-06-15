package br.com.alura.capIII.testes;

import br.com.alura.capIII.util.Contador;

public class Programa {

	public static void main(String[] args) {

		Runnable contadorI = new Contador();
		Thread threadI = new Thread(contadorI);

		Runnable contadorII = new Contador();
		Thread threadII = new Thread(contadorII);

		threadI.start();
		threadII.start();

	}
}
