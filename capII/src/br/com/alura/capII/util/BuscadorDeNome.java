package br.com.alura.capII.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BuscadorDeNome implements Runnable {

	private String nome;
	private File arquivo;

	public BuscadorDeNome(String nome, File arquivo) {
		this.nome = nome;
		this.arquivo = arquivo;
	}

	@Override
	public void run() {
		buscar();
	}

	private void buscar() {

		try {
			Scanner scanner = new Scanner(arquivo);

			int numeroDaLinha = 1;
			while (scanner.hasNextLine()) {
				String conteudoDaLinhaAtual = scanner.next();
				if (conteudoDaLinhaAtual.equalsIgnoreCase(nome)) {
					System.out.println("Arquivo: " + arquivo.getName() + " - Linha: " + numeroDaLinha + " - Nome: "
						+ conteudoDaLinhaAtual);
				}

				numeroDaLinha++;
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
