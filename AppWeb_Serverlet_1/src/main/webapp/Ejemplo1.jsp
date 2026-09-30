<%@page import="dominio.Usuario" %>
<%@page import="dominio.UsuarioDao" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Ejemplo1.jsp" method="get">
		Ingrese su nombre <input type="text" name="txtNombre"> <br>
		Ingrese su apellido <input type="text" name="txtApellido"> <br>
		
		<input type="submit" value="Aceptar" name="btnAceptar">
	</form>
	
	<%
		int result = 0;
		if (request.getParameter("btnAceptar") != null) {
			Usuario u = new Usuario();
			u.setNombre(request.getParameter("txtNombre"));
			u.setApellido(request.getParameter("txtApellido"));
			
			UsuarioDao db = new UsuarioDao();
			result = db.agregarUsuario(u);
		}
	%>
	
	<%
		if (result == 1) {
	%>
		Usuario agregado
	<%	
		}
	%>
</body>
</html>