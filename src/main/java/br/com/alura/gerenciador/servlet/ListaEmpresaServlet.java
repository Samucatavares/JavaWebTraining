package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Servlet implementation class ListaEmpresaServlet
 */
@WebServlet("/listaempresa")
public class ListaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaEmpresaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();// TODO Auto-generated method stub
		List<Empresa> lista = banco.getEmpresas();
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<ul>");
		for(Empresa empresa: lista) {
			out.println("<li>"  + empresa.getNome()+"<li>");
		}
		out.println("</ul>");
		out.println("</body></html");

	}

}
