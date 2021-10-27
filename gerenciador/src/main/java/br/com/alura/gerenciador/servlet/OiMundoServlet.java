package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns ="/oi")
public class OiMundoServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter out =  resp.getWriter(); /*printWriter devolve caracteres*/
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Olá, Mundo!!</h1>");
		out.println("</body>");
		out.println("</html>");
		
	}
}
