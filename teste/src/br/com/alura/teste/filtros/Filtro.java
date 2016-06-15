package br.com.alura.teste.filtros;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Filtro implements Filter {

	public static ThreadLocal<String> usuario = new ThreadLocal<>();

	@Override
	public void init(FilterConfig fConfig) throws ServletException {}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
		throws IOException, ServletException {

		HttpServletRequest request2 = (HttpServletRequest) request;
		HttpSession session = request2.getSession(false);

		if (session != null)
			usuario.set(session.getAttribute("usuario").toString());

		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {}

}
