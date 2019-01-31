<%-- 
    Document   : clienteExtracto
    Created on : 31-ene-2019, 11:30:10
    Author     : alumno
--%>

<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="almacen.*" %>
<%
	HttpSession sesion = request.getSession();
	ConectorSQL con = (ConectorSQL) sesion.getAttribute("con");
	String[] datos = null;
	String code = request.getParameter("clientCode");
	if (code == null) {
		code = (String) sesion.getAttribute("codCliente");
	}

	while (code.length() < 6) {
		code = "0" + code;
	}

	if (con != null && con.checkCodigoCliente(code)) {
		datos = con.sacarDatosClientes(code);
		sesion.setAttribute("cliente", datos);
		sesion.setAttribute("codCliente", code);
	}

%>
<!DOCTYPE html>
<html>
    <head>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<title><%=con == null
							 ? "ERROR"
							 : con.checkCodigoCliente(code)
							   ? "Pedidos"
							   : "ERROR"%></title>
		<script>
			$(document).ready(function () {
				$('#start').change(function () {
					console.log($('#start').val());
					$('#end').attr({'min': $('#start').val()});
				});
			});
		</script>
    </head>
    <body>
        <%if (datos != null) {%>

		<h1>Gestión de Extractos</h1>

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
		<h2>Fechas del extracto</h2>
		<form action="extracto.jsp" method="post">
			<%
				Date today = new Date();
				Calendar cal = Calendar.getInstance();
				cal.setTime(today);
				cal.add(Calendar.YEAR, -5);
				Date min = cal.getTime();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD");
			%>
			desde:
			<input type="date" name="start" id="start" required autofocus step="1" min="<%=sdf.format(min)%>" max="<%=sdf.format(today)%>" value="<%=sdf.format(min)%>"/>
			hasta:
			<input type="date" name="end" id="end" required autofocus step="1" min="<%=sdf.format(min)%>" max="<%=sdf.format(today)%>" value="<%=sdf.format(today)%>"/>
			<button type="submit"> Aceptar </button>
			<button type="reset"> Cancelar </button>
		</form>
		<%} else {%>
		<h1>ERROR, Código de Cliente <%=request.getParameter("clientCode")%> no existe.</h1>


		<% }%>
		<br/>
		<br/>
		<a href="extractosClientes.jsp"><b>Nuevo Cliente</b></a>
		<a href="index.jsp"><b>Volver a la página principal</b></a>
	</body> 
</html>

