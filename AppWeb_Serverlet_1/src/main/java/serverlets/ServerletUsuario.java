package serverlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import dominio.Usuario;
import dominio.UsuarioDao;

/**
 * Servlet implementation class ServerletUsuario
 */
@WebServlet("/ServerletUsuario")
public class ServerletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerletUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int result = 0;
		
		if (request.getParameter("Param") != null) {
			// Entra por haber hecho click sobre el hyperlink
			UsuarioDao udao = new UsuarioDao();
			
			ArrayList<Usuario> lista = udao.obtenerTodosLosUsuarios();
			
			request.setAttribute("listaU", lista);
			RequestDispatcher rd = request.getRequestDispatcher("/Ejemplo3.jsp");
			rd.forward(request, response);
		}
		
		if (request.getParameter("btnAceptar") != null) {
			Usuario u = new Usuario();
			u.setNombre(request.getParameter("txtNombre"));
			u.setApellido(request.getParameter("txtApellido"));
			
			UsuarioDao db = new UsuarioDao();
			result = db.agregarUsuario(u);
		}
		
		// Volver al .jsp
		// REQUESTDISPATCHER
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("Ejemplo1.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("btnMostrarUsuarios") != null ) {
			UsuarioDao udao = new UsuarioDao();
			
			ArrayList<Usuario> lista = udao.obtenerTodosLosUsuarios();
			
			request.setAttribute("listaU", lista);
			RequestDispatcher rd = request.getRequestDispatcher("/Ejemplo2.jsp");
			rd.forward(request, response);
		}
	}

}
