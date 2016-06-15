package br.com.empresa.runables.testes;

import java.util.Collection;
import java.util.Vector;

import br.com.empresa.runables.ProduzMensagens;

public class RegistroDeMensagens {
	public static void main(String[] args) throws InterruptedException {
		Collection<String> mensagens = new Vector<>();

		Thread t1 = new Thread(new ProduzMensagens(0, 10000, mensagens));
		Thread t2 = new Thread(new ProduzMensagens(10000, 20000, mensagens));
		Thread t3 = new Thread(new ProduzMensagens(20000, 30000, mensagens));

		t1.start();
		t2.start();
		t3.start();

		// faz com que a thread que roda o main aguarde o fim dessas
		t1.join();
		t2.join();
		t3.join();

		System.out.println("Threads produtoras de mensagens finalizadas!");

		// verifica se todas as mensagens foram guardadas
		for (int i = 0; i < 15000; i++) {
			if (!mensagens.contains("Mensagem " + i)) {
				throw new IllegalStateException("n�o encontrei a mensagem: " + i);
			}
		}

		// verifica se alguma mensagem ficou nula
		if (mensagens.contains(null)) {
			throw new IllegalStateException("n�o devia ter null aqui dentro!");
		}

		System.out.println("Fim da execucao com sucesso");
	}
}
