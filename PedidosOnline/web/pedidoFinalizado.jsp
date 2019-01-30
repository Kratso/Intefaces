<%-- 
    Document   : pedidoFinalizado
    Created on : 29-ene-2019, 10:05:50
    Author     : alumno
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="almacen.*" %>
<%HttpSession sesion = request.getSession();
	ConectorSQL con = (ConectorSQL) sesion.getAttribute("con");
	String[] cliente = (String[]) sesion.getAttribute("cliente");
	ArrayList<Articulo> carrito = (ArrayList) sesion.getAttribute("carrito");
	try {
		con.meterVentaInternet(carrito, (String) sesion.getAttribute("codCliente"));
	} catch (Exception e) {

	}
	double total = 0;
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
        <h1>Pedido finalizado</h1>

		<p>Si desea imprimir el pedido, pulse <a href="factura.jsp" target="_blank"><b>aquí</b></a> y seleccione en las opciones del navegador Imprimir.</p>
		<p>Si no va a imprimir, puede <a href="index.jsp"><b>volver a la página principal</b></a>.</p>
		<div id="factura" style="text-align: center">
			<p>======================================================================================================================================</p>

			<h1 style="text-align: center">Compañía Genérica S.L.</h1>

			<h2 style="text-align: center">CIF: 28938475-J</h2>

			<h3 style="text-align: center"> C/ Isla Sabora nº 3, Collado Villalba 28400, Madrid, España</h3>

			<p>======================================================================================================================================</p>

			<p><b>Cliente: </b> <%=sesion.getAttribute("codCliente")%>   <b>NIF: </b><%=cliente[0]%></p>
			<p><b>D./Dña.: </b> <%=cliente[2]%> <%=cliente[1]%></p>
			<p><%= cliente[3]%></p>
			<p><%= cliente[4]%>, <%=cliente[5]%></p>

			<p>======================================================================================================================================</p>

			<table style="margin: auto; text-align: center;">
				<tr>
					<th>Artículo</th>
					<th>Descripción</th>
					<th>Cantidad</th>
					<th>Precio</th>
					<th>Importe</th>
				</tr>	
				<% for (Articulo a : carrito) {%>
				<tr>
					<td><%=a.codigo%></td>
					<td><%=a.descripcion%></td>
					<td><%=a.cantidad%></td>
					<td ><%=a.pv%></td>
					<td><%=a.importe%></td>
				</tr>
				<% total += Double.parseDouble(a.importe);
				}%>
			</table>

			<p>======================================================================================================================================</p>

			<div style="text-align: right"><h2>Total Factura(IVA Incluído): <%=total%></h2></div>
			
			<p>======================================================================================================================================</p>


		</div>
    </body>
</html>
