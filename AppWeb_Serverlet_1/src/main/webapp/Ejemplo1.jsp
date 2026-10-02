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
	<form action="ServerletUsuario" method="get">
		Ingrese su nombre <input type="text" name="txtNombre"> <br>
		Ingrese su apellido <input type="text" name="txtApellido"> <br>
		
		<input type="submit" value="Aceptar" name="btnAceptar">
	</form>
	
	<%
		int rows = 0;
		if (request.getAttribute("result") != null)
			rows = Integer.parseInt(request.getAttribute("result").toString());
		
		if (rows > 0) {
	%>
			Usuario agregado con éxito.
	<%			
		}
	%>
	
</body>
</html>