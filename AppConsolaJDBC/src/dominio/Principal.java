package dominio;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		 UsuarioDao usuarioDao = new UsuarioDao();
		 /* 
		 * Usuario usuario1 = new Usuario(); usuario1.setNombre("Angela");
		 * usuario1.setApellido("Leiva");
		 * 
		 * int filas = usuarioDao.agregarUsuario(usuario1);
		 * 
		 * if (filas == 1) System.out.println("usuario agregado"); else
		 * System.out.println("usuario NO agregado");
		 * 
		 */
		
		// ----------------------------------------- //
		
		/*
		Usuario user2 = usuarioDao.obtenerUsuario(1);
		
		System.out.println(user2.toString());
		
		*/
		
		// ----------------------------------------- //
		
		
		  ArrayList<Usuario> listUsuarios = usuarioDao.obtenerTodosLosUsuarios();
		  
		  for (Usuario usuario : listUsuarios) {
			  System.out.println(usuario.toString());
		  }
		 
		 
		// ----------------------------------------- //
		 Usuario user3 = usuarioDao.obtenerUsuario2(3);
			
		 System.out.println(user3.toString());
	}
}
