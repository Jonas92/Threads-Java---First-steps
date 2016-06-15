package br.com.alura.capV_future_e_callable.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RetornaFatorialTest {

	private RetornaFatorial retornaFatorial;

	@Test
	public void testRetornaFatorialDe0() {
		retornaFatorial = new RetornaFatorial(0);

		assertEquals(1, retornaFatorial.calculaFatorial());
	}

	@Test
	public void testRetornaFatorialDe1() {
		retornaFatorial = new RetornaFatorial(1);

		assertEquals(1, retornaFatorial.calculaFatorial());
	}

	@Test
	public void testRetornaFatorialDe2() {
		retornaFatorial = new RetornaFatorial(2);

		assertEquals(2, retornaFatorial.calculaFatorial());
	}

	@Test
	public void testRetornaFatorialDe3() {
		retornaFatorial = new RetornaFatorial(3);

		assertEquals(6, retornaFatorial.calculaFatorial());
	}

	@Test
	public void testRetornaFatorialDe4() {
		retornaFatorial = new RetornaFatorial(4);

		assertEquals(24, retornaFatorial.calculaFatorial());
	}

	@Test
	public void testRetornaFatorialDe5() {
		retornaFatorial = new RetornaFatorial(5);

		assertEquals(120, retornaFatorial.calculaFatorial());
	}

	@Test
	public void testRetornaFatorialDe10() {
		retornaFatorial = new RetornaFatorial(10);

		assertEquals(3628800, retornaFatorial.calculaFatorial());
	}

}
