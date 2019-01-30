<%-- 
    Document   : lineaBien
    Created on : 29-ene-2019, 9:09:50
    Author     : alumno
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="almacen.*" %>
<%HttpSession sesion = request.getSession();
	ConectorSQL con = (ConectorSQL) sesion.getAttribute("con");
	String[] cliente = (String[]) sesion.getAttribute("cliente");
	String code = (String) sesion.getAttribute("codCliente");
	Articulo art = (Articulo) sesion.getAttribute("articuloNuevo");
	art.cantidad = request.getParameter("cantidad");
	art.importe = (Double.parseDouble(art.cantidad) * art.pv) + "";
	ArrayList<Articulo> carrito = (ArrayList) sesion.getAttribute("carrito");
	carrito.add(art);
	sesion.setAttribute("carrito", carrito);
	double total = 0;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <title><%=con == null
							 ? "ERROR"
							 : "ConfirmarPedido"%></title>
							 <% if(con == null){%><meta http-equiv="refresh" content="0; URL=index.jsp"><%}%>
    </head>
    <body>
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
		<h2>Confirmar Pedido</h2>

		<table>
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

		<h2>Importe del pedido: <%=total%></h2>

		<p>___________________________________________________________________________________________</p>
		<form action="pedidoFinalizado.jsp" method="post">
			<button>Aceptar pedido</button>
		</form>
		<a href="clientePedido.jsp"><b>Nuevo Artículo</b></a>
		<a href="index.jsp"><b>Volver a la página principal</b></a>
    </body>
</html>
