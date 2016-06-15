package br.com.alura.capV_future_e_callable.util;

import java.util.concurrent.BlockingQueue;

public class RetornaFatorial implements Runnable {

	private int numero;
	private BlockingQueue<Integer> listaDeFatoriais;

	public RetornaFatorial(int numero, BlockingQueue<Integer> listaDeFatoriais) {
		this.numero = numero;
		this.listaDeFatoriais = listaDeFatoriais;
	}

	@Override
	public void run() {
		try {
			listaDeFatoriais.put(new Integer(calculaFatorial()));
		} catch (InterruptedException e) {
			System.out.println("Erro na thread " + Thread.currentThread().getName());
		}
	}

	private int calculaFatorial() {

		System.out.println(Thread.currentThread().getName() + " iniciando - Fatorial de " + numero);
		int fatorial = 1;

		if (naoEhZeroOuUm())
			for (int i = numero; i > 1; i--)
				fatorial *= i;

		System.out.println(Thread.currentThread().getName() + " concluindo - resultado: " + fatorial);
		return fatorial;
	}

	private boolean naoEhZeroOuUm() {
		return !(numero == 1) || !(numero == 0);
	}

}
