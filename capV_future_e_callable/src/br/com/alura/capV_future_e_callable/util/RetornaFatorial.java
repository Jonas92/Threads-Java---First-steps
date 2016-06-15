package br.com.alura.capV_future_e_callable.util;

import java.util.concurrent.Callable;

public class RetornaFatorial implements Callable<Integer> {

	private int numero;

	public RetornaFatorial(int numero) {
		this.numero = numero;
	}

	@Override
	public Integer call() throws Exception {
		return calculaFatorial();
	}

	public int calculaFatorial() {

		System.out.println(Thread.currentThread().getName() + " iniciando - Fatorial de " + numero);
		int fatorial = 1;

		if (numero == 1 || numero == 0) {
			System.out.println(Thread.currentThread().getName() + " concluindo - resultado: " + fatorial);
			return 1;
		}

		for (int i = numero; i > 1; i--)
			fatorial *= i;

		System.out.println(Thread.currentThread().getName() + " concluindo - resultado: " + fatorial);
		return fatorial;
	}

}
