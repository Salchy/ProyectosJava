<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="dominio.Usuario" %>
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="ServerletUsuario?Param=1"> Mostrar usuario </a>
	
	<%
		ArrayList<Usuario> listaUsuarios = null;
		if (request.getAttribute("listaU") != null) {
			listaUsuarios = (ArrayList<Usuario>) request.getAttribute("listaU");
		}
	 %>
	 
	 <table border="1">
	 	<tr>
		 	<th>ID</th>
		 	<th>Nombre</th>
		 	<th>Apellido</th>
	 	</tr>
	 	
	 	<%
	 		if (listaUsuarios != null) {
	 			for (Usuario user : listaUsuarios) {
	 		
	 	 %>
	 	<tr> <td> <%= user.getId() %> </td> <td> <%= user.getNombre() %> </td> <td> <%= user.getApellido() %> </td> </tr>
	 	<%
	 			}
	 		}		
	 	 %>
	 </table>
</body>
</html>