package br.com.alura.capI.ex4.runnable;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TrataEmParalelo implements Runnable {

	public Socket cliente;

	public TrataEmParalelo(Socket cliente) {
		this.cliente = cliente;
	}

	@Override
	public void run() {
		Scanner s = null;
		try {
			s = new Scanner(this.cliente.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		while (s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
		s.close();
	}

}
