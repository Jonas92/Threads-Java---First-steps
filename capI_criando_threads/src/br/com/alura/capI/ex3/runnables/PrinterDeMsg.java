package br.com.alura.capI.ex3.runnables;

public class PrinterDeMsg implements Runnable {

	private String msg;

	public PrinterDeMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		imprimirMsg();
	}

	private void imprimirMsg() {
		System.out.println(msg);
	}

}
