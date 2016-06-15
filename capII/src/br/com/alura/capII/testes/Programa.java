package br.com.alura.capII.testes;

import java.io.File;

import br.com.alura.capII.util.BuscadorDeNome;

public class Programa {

	public static void main(String[] args) {

		String nome = "Anastácia";
		BuscadorDeNome buscadorDeNomeI = new BuscadorDeNome(nome, new File("nomesComunsIniciandoComA.txt"));
		BuscadorDeNome buscadorDeNomeII = new BuscadorDeNome(nome, new File("nomesFemininosIniciandoComA.txt"));
		BuscadorDeNome buscadorDeNomeIII = new BuscadorDeNome(nome, new File("nomesMasculinosIniciandoComA.txt"));

		Thread threadI = new Thread(buscadorDeNomeI);
		Thread threadII = new Thread(buscadorDeNomeII);
		Thread threadIII = new Thread(buscadorDeNomeIII);

		threadI.start();
		threadII.start();
		threadIII.start();

	}
}
