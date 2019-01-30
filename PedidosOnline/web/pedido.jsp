<%-- 
    Document   : pedido
    Created on : 28-ene-2019, 13:57:41
    Author     : alumno
--%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="almacen.*" %>
<%HttpSession sesion = request.getSession();
	ConectorSQL con = (ConectorSQL) sesion.getAttribute("con");
	String[] cliente = (String[]) sesion.getAttribute("cliente");
	String[] datos = null;
	String code = request.getParameter("codigoArticulo");
	String codeCliente;
	if (code != null) {
		while (code.length() < 6) {
			code = "0" + code;
		}
		if (con != null && con.getArticuloByCodigo(code) != null) {
			datos = con.getArticuloByCodigo(code);
			Articulo art = new Articulo(datos, null, null);
			sesion.setAttribute("articuloNuevo", art);
		}
	} else{
		codeCliente = (String) sesion.getAttribute("codCliente");
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
							   ? "Pedido"
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
				<td><%=(String) sesion.getAttribute("codCliente")%></td>
				<td id="dni"><%=cliente[0] + con.generarLetraDNI(cliente[0])%></td>
				<td><%=cliente[2]%></td>
				<td><%=cliente[1]%></td>
			</tr>
			<tr>
				<th>Domicilio</th>
				<th>C.P.</th>
				<th>Localidad</th>
				<th>Total</th>
			</tr>
			<tr>
				<td><%=cliente[3]%></td>
				<td><%=cliente[4]%></td>
				<td><%=cliente[5]%></td>
				<td><%=cliente[10]%></td>
			</tr>
		</table>

		<p>___________________________________________________________________________________________</p>
		<h2>Realizar Pedido</h2>
		<form action="lineaBien.jsp" method="post">

			<table>
				<tr>
					<th>Artículo</th>
					<th>Descripción</th>
					<th>Cantidad</th>
					<th>Precio</th>
					<th>Importe</th>
				</tr>	
				<tr>
					<td><%=datos[0]%></td>
					<td><%=datos[1]%></td>
					<td><input type="text" autofocus required pattern="^[1-9][0-9]{0,5}$" id="cantidad" name="cantidad" onkeyup="caretUpdate()"/></td>
					<td id="val"><%=datos[5]%></td>
					<td><input type="text" required disabled id="importe" name="importe"/></td>
				</tr>
			</table>

			<button type="submit">Aceptar</button>
			<button type="reset" onclick="reset()">Cancelar</button>
			<script>function reset(){
				var a = document.getElementById("codigo");
				a.focus();
				a.value = "";
			}</script>
		</form>
		<script>
			function caretUpdate() {
				console.log($('#val').html());
				console.log($('#cantidad').val());
				if ($('#cantidad').val().match('^[1-9][0-9]{0,5}$'))
					$('#importe').val(($('#cantidad').val()) * ($('#val').html()));
				else
					$('#importe').val('');
			}
		</script>
		<%} else {%>
		<h1>ERROR, Código de Artículo <%=code%> no existe.</h1>


		<% }%>
		<br/>
		<br/>
		<a href="clientePedido.jsp"><b>Nuevo Artículo</b></a>
		<a href="index.jsp"><b>Volver a la página principal</b></a>
    </body>
</html>
