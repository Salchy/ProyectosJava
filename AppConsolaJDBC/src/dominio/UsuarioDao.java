package dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UsuarioDao {
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "root";
	private String dbName = "bdregistro";
	
	public UsuarioDao() {
		
	}
	
	public int agregarUsuario(Usuario usuario) {
		String query = "INSERT INTO Usuario(Nombre, Apellido) VALUES ('" + usuario.getNombre() + "', '" + usuario.getApellido() + "')";
		
		Connection cn = null;
		int filas = 0;
		
		try {
			cn = DriverManager.getConnection(host + dbName, user, pass);
			Statement st = cn.createStatement();
			filas = st.executeUpdate(query);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return filas;
	}
	
	public Usuario obtenerUsuario(int id) {
		Connection con = null;
		Usuario x = new Usuario();
		
		try {
			con = DriverManager.getConnection(host + dbName, user, pass);
			Statement st = con.createStatement();
			
			String query = "SELECT * FROM usuario WHERE id = " + id;
			
			ResultSet result = st.executeQuery(query);
			
			result.next();
			
			x.setNombre(result.getString("nombre"));
			x.setApellido(result.getString("apellido"));
			x.setId(result.getInt("id"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return x;
	}
}
