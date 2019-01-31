<%-- 
    Document   : pedidosClientes
    Created on : 24-ene-2019, 14:02:56
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="almacen.*" %>
<%

	HttpSession sesion = request.getSession(true);
	ConectorSQL con = null;
	try {
		con = new ConectorSQL();
		con.conectarDB();
	} catch (Exception e) {
		out.print(e);
	}
	sesion.setAttribute("con", con);
	if(sesion.getAttribute("carrito") != null)
		sesion.setAttribute("carrito", null);
%>
<!DOCTYPE html>
<html>
	<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pedidos Online</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script>
					$("#reset").click(() => {
					document.getElementById("codigo").focus();
			});
		</script>
    </head>
    <body>
		<%
			if (con != null) {

		%>
        <h1>Pedidos de Compañía Genérica SL</h1>
		<form action="clientePedido.jsp" method="post">
			<div>
				<p><b>Introduzca su código de cliente:</b></p>
				<input id="codigo" type="text" name="clientCode" required autofocus pattern="^[a-zA-Z0-9]{1,6}$"/>
				<p style="font-size: 10px; color: grey;">El código de cliente es una clave alfanumérica de 1 a 6 carácteres, p. ej. C0221J</p>
				<button type="submit">Iniciar pedido</button>
				<button type="reset" id="reset" onclick="document.getElementById('codigo').focus()">Cancelar</button>
			</div>
		</form>
		<br/>	
		<% } else { %>
		<div><h1>Ha ocurrido un error en el acceso a la base de datos</h1></div>
		<% }%>
		<a href="index.jsp"><b>Volver a la página principal</b></a>
    </body>
</html>
