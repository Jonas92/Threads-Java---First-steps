package br.com.caelum.capII_exceptions.util.exceptions;

import java.lang.Thread.UncaughtExceptionHandler;

public class TratadorDeExceptionsEmThreads implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("Erro na thread " + t.getName() + " - " + e.getMessage());
	}

}
