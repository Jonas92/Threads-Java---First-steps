package br.com.alura.capV_future_e_callable.testes;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import br.com.alura.capV_future_e_callable.util.RetornaFatorial;

public class Programa {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newCachedThreadPool();

		Future<Integer> resultadoDoFuturoI = executorService.submit(new RetornaFatorial(5));
		Future<Integer> resultadoDoFuturoII = executorService.submit(new RetornaFatorial(2));
		Future<Integer> resultadoDoFuturoIII = executorService.submit(new RetornaFatorial(0));

		int somaDosFatoriais = resultadoDoFuturoI.get() + resultadoDoFuturoII.get() + resultadoDoFuturoIII.get();

		System.out.println("\nSoma dos fatoriais " + somaDosFatoriais);

		executorService.shutdown();
	}
}
