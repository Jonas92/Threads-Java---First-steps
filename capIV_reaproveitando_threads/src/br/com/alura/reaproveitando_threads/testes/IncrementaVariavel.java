package br.com.alura.reaproveitando_threads.testes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IncrementaVariavel implements Runnable {

	// CRIA UM POOL DE THREADS
	private static ExecutorService executorService = Executors.newCachedThreadPool();

	private static Integer total = 0;

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			executorService.execute(new IncrementaVariavel());
		}

		executorService.shutdown();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (total) {
				total++;
				System.out.println(total);
			}
		}
	}
}
