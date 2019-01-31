<%-- 
    Document   : extractoImprimir
    Created on : 31-ene-2019, 12:54:39
    Author     : alumno
--%>


<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="almacen.*" %>
<%HttpSession sesion = request.getSession();
	ConectorSQL con = (ConectorSQL) sesion.getAttribute("con");
	String[] cliente = (String[]) sesion.getAttribute("cliente");
	String min = (String)session.getAttribute("min");
	String max = (String)session.getAttribute("max");

	
	String code = (String) sesion.getAttribute("codCliente");
	List<Pedido> pedidos = con.getPedidosEntre(min, max, code);
%>
<!DOCTYPE html>
<html>
	<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <title><%=con == null
							 ? "ERROR"
							 : "Pedido Finalizado"%></title>
    </head>
    <body>

		<p>======================================================================================================================================</p>

		<h1 style="text-align: center">Compañía Genérica S.L.</h1>

		<h2 style="text-align: center">CIF: 28938475-J</h2>

		<h3 style="text-align: center"> C/ Isla Sabora nº 3, Collado Villalba 28400, Madrid, España</h3>

		<p>======================================================================================================================================</p>

		<p><b>Cliente: </b> <%=sesion.getAttribute("codCliente")%>   <b>NIF: </b><%=cliente[0] + con.generarLetraDNI(cliente[0])%></p>
		<p><b>D./Dña.: </b> <%=cliente[2]%> <%=cliente[1]%></p>
		<p><%= cliente[3]%></p>
		<p><%= cliente[4]%>, <%=cliente[5]%></p>

		<p>======================================================================================================================================</p>
		<% if (!pedidos.isEmpty()) { %>
		<table style="margin: auto; text-align: center;">
			<tr>
				<th>Fecha</th>
				<th>Artículo</th>
				<th>Cantidad</th>
			</tr>	
			<% for (Pedido p : pedidos) {%>
			<tr>
				<td><%=p.fecha%></td>
				<td><%=p.articulo%></td>
				<td><%=p.cantidad%></td>
			</tr>
			<% } %>
		</table>

		<p>======================================================================================================================================</p>

		<% } else {%>
		<h1>No hay extractos disponibles entre las fechas <%=min%> y <%=max%></h1>
		<% }%>

	</div>
</body>
</html>