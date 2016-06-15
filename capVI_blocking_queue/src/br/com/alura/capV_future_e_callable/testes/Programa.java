package br.com.alura.capV_future_e_callable.testes;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import br.com.alura.capV_future_e_callable.util.RetornaFatorial;

public class Programa {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
		ExecutorService executorService = Executors.newCachedThreadPool();

		executorService.submit(new RetornaFatorial(5, queue));
		executorService.submit(new RetornaFatorial(2, queue));
		executorService.submit(new RetornaFatorial(3, queue));

		int somaDosFatoriais = queue.take() + queue.take() + queue.take();

		System.out.println("\nSoma dos fatoriais " + somaDosFatoriais);

		executorService.shutdown();
	}
}
