<%-- 
    Document   : clientePedido
    Created on : 28-ene-2019, 12:53:13
    Author     : alumno
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="almacen.*" %>
<%
	HttpSession sesion = request.getSession();
	ConectorSQL con = (ConectorSQL) sesion.getAttribute("con");
	String[] datos = null;
	String code = request.getParameter("clientCode");
	if(code == null)
		code = (String)sesion.getAttribute("codCliente");

	while(code.length() < 6)
		code = "0" + code;

	if (con != null && con.checkCodigoCliente(code)) {
		datos = con.sacarDatosClientes(code);
		sesion.setAttribute("cliente", datos);
		sesion.setAttribute("codCliente", code);
	}
	ArrayList<Articulo> carrito = (ArrayList) sesion.getAttribute("carrito");
	if (carrito == null) {
		carrito = new ArrayList();
		sesion.setAttribute("carrito", carrito);
	}

%>
<!DOCTYPE html>
<html>
    <head>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title><%=con == null
							 ? "ERROR"
							 : con.checkCodigoCliente(code)
							   ? "Pedidos"
							   : "ERROR"%></title>
    </head>
    <body>
        <%if (datos != null) {%>

		<h1>Gestión de Pedido</h1>

		<h2>Datos del Cliente</h2>

		<table>
			<tr>
				<th>Código</th>
				<th>NIF</th>
				<th>Nombre</th>
				<th>Apellidos</th>
			</tr>
			<tr>
				<td><%=code%></td>
				<td id="dni"><%=datos[0] + con.generarLetraDNI(datos[0])%></td>
				<td><%=datos[2]%></td>
				<td><%=datos[1]%></td>
			</tr>
			<tr>
				<th>Domicilio</th>
				<th>C.P.</th>
				<th>Localidad</th>
				<th>Total</th>
			</tr>
			<tr>
				<td><%=datos[3]%></td>
				<td><%=datos[4]%></td>
				<td><%=datos[5]%></td>
				<td><%=datos[10]%></td>
			</tr>
		</table>

		<p>___________________________________________________________________________________________</p>
		<h2>Realizar Pedido</h2>
		<form action="pedido.jsp" method="post">
			
			<input type="text" name="codigoArticulo" id="codigo" required autofocus length="6"/>
			
			<button type="submit">Aceptar</button>
			<button type="reset"onclick="reset()">Cancelar</button>
			<script>function reset(){
				var a = document.getElementById("codigo");
				a.focus();
				a.value = "";
			}</script>
		</form>
		<%} else {%>
		<h1>ERROR, Código de Cliente <%=request.getParameter("clientCode")%> no existe.</h1>


		<% }%>
		<br/>
		<br/>
		<a href="pedidosClientes.jsp"><b>Nuevo Cliente</b></a>
		<a href="index.jsp"><b>Volver a la página principal</b></a>
	</body> 
</html>
