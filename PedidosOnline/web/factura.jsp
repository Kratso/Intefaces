<%-- 
    Document   : factura
    Created on : 29-ene-2019, 11:05:32
    Author     : alumno
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="almacen.*" %>
<%HttpSession sesion = request.getSession();
	ConectorSQL con = (ConectorSQL) sesion.getAttribute("con");
	String[] cliente = (String[]) sesion.getAttribute("cliente");
	ArrayList<Articulo> carrito = (ArrayList) sesion.getAttribute("carrito");
	double total = 0;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Factura</title>
    </head>
    <body>
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

			<div style="text-align: right; margin-right: 100px;"><h2>Total Factura(IVA Incluído): <%=total%></h2></div>
			<p>======================================================================================================================================</p>


		</div>
    </body>
</html>
