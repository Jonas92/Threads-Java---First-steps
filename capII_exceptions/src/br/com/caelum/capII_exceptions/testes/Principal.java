package br.com.caelum.capII_exceptions.testes;

import java.util.Properties;

import br.com.caelum.capII_exceptions.util.LeitorPropriedades;
import br.com.caelum.capII_exceptions.util.exceptions.TratadorDeExceptionsEmThreads;

public class Principal {

	Properties p1;
	Properties p2;
	Properties p3;

	public static void main(String[] args) {
		new Principal().lerPropriedades();
	}

	public void lerPropriedades() {
		TratadorDeExceptionsEmThreads tratadorDeExceptionsEmThreads = new TratadorDeExceptionsEmThreads();

		Thread thread = new Thread(new LeitorPropriedades(p1, "arquivo1.txt"));
		thread.setUncaughtExceptionHandler(tratadorDeExceptionsEmThreads);

		Thread thread2 = new Thread(new LeitorPropriedades(p2, "arquivo2.txt"));
		thread2.setUncaughtExceptionHandler(tratadorDeExceptionsEmThreads);

		Thread thread3 = new Thread(new LeitorPropriedades(p3, "arquivo3.txt"));
		thread3.setUncaughtExceptionHandler(tratadorDeExceptionsEmThreads);

		thread.start();
		thread2.start();
		thread3.start();
	}
}
