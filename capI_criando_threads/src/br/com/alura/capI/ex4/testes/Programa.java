package br.com.alura.capI.ex4.testes;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import br.com.alura.capI.ex4.runnable.TrataEmParalelo;

public class Programa {

	public static void main(String[] args) throws IOException {

		ServerSocket servidor = new ServerSocket(12345);
		while (true) {
			Socket cliente = servidor.accept();
			servidor.close();
			Thread t = new Thread(new TrataEmParalelo(cliente));
			t.start();
		}

	}
}
