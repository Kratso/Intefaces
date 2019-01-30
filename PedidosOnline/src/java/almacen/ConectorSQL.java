/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alumno
 */
public class ConectorSQL implements Serializable{

	

	public Connection con;
	public Statement st;
	public static Statement sts;

	public void conectarDB() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		con = DriverManager.getConnection("jdbc:mysql://localhost/desarrolloInterfaces", "root", "manager");
		//con.setAutoCommit(true); //Cada vez que hagamos una operación, necesitmaos hacer un commit() para guardar.
		st = con.createStatement();
		sts = st;
		con.setAutoCommit(false);
	}
	
	public void commit() throws SQLException{
		con.commit();
	}
	
	public void rollback() throws SQLException{
		con.rollback();
	}
	
	boolean checkCodigo(String text) throws SQLException {
		String sql = "select codigo from proveedores where codigo = " + text;
		ResultSet rs = st.executeQuery(sql);
		return rs.next();
	}

	public void crearTabla() throws SQLException {
		String sentencia = "create table clientes(\n"
						   + "codigo char(6),"
						   + "nif char(9),"
						   + "apellidos varchar(35),"
						   + "nombre varchar(15),"
						   + "domicilio varchar(40),"
						   + "codigo_postal char(5),"
						   + "localidad varchar(20),"
						   + "telefono char(9),"
						   + "movil char(9),"
						   + "fax char(9),"
						   + "email varchar(20),"
						   + "total_ventas float(7,2),"
						   + "CONSTRAINT PK_cod primary key(codigo));";
		//ExecuteUpdate es para sentencias de tipo create, insert, delete o update.
		st.executeUpdate(sentencia);
	}

	public void insertarVenta(String codigo, String nif, String apellidos, String nombre, String domicilio, String cp, String localidad, String telefono, String movil, String fax, String email, String ventas) throws SQLException {
		String sentencia = "insert into clientes()"
						   + "values('" + codigo + "','" + nif + "','" + apellidos + "','" + nombre + "','" + domicilio + "','" + cp + "','" + localidad + "','" + telefono + "','" + movil + "','" + fax + "','" + email + "','" + ventas + "')";
		st.executeUpdate(sentencia);
	}

	public void modCliente(String codigo, String nif, String apellidos, String nombre, String domicilio, String cp, String localidad, String telefono, String movil, String fax, String email, String ventas) throws SQLException {
		String sentencia = "update clientes set nif='" + nif + "',apellidos='" + apellidos + "',nombre='" + nombre + "'," + "domicilio='" + domicilio + "',codigo_postal='" + cp + "',localidad='" + localidad + "',telefono='" + telefono + "',movil='" + movil + "',fax='" + fax + "',email='" + email + "',total_ventas='" + ventas + "' where codigo='" + codigo + "'";
		st.executeUpdate(sentencia);
	}

	public void borrarCliente(String codigo) throws SQLException {
		String sentencia = "delete from clientes where codigo = " + codigo + ";";
		st.executeUpdate(sentencia);
	}
	
	public String[] sacarDatosProveedores(String codigo) throws SQLException {
		String all = "select * from proveedores where codigo=" + codigo;
		/*String ape = "select apellidos from clientes where codigo="+codigo;
		 String nom = "select nombre from clientes where codigo="+codigo;
		 String dom = "select domicilio from clientes where codigo="+codigo;
		 String cp = "select codigo_postal from clientes where codigo="+codigo;
		 String loc = "select localidad from clientes where codigo="+codigo;
		 String tel = "select telefono from clientes where codigo="+codigo;
		 String movil = "select movil from clientes where codigo="+codigo;
		 String fax = "select nif from clientes where codigo="+codigo;
		 String email = "select email from clientes where codigo="+codigo;*/
		String nif = null;
		String ape = null;
		String nom = null;
		String dom = null;
		String cp = null;
		String loc = null;
		String tel = null;
		String movil = null;
		String fax = null;
		String email = null;
		double total = 0;
		ResultSet listaMovimientos = con.createStatement().executeQuery(all);
		while (listaMovimientos.next()) {
			nif = listaMovimientos.getString("nif");
			ape = listaMovimientos.getString("apellidos");
			nom = listaMovimientos.getString("nombre");
			dom = listaMovimientos.getString("domicilio");
			cp = listaMovimientos.getString("codigo_postal");
			loc = listaMovimientos.getString("localidad");
			tel = listaMovimientos.getString("telefono");
			movil = listaMovimientos.getString("movil");
			fax = listaMovimientos.getString("fax");
			email = listaMovimientos.getString("email");
			total = listaMovimientos.getDouble("total_ventas");
		}
		nif = nif.substring(0, 8);
		String[] datos = {nif, ape, nom, dom, cp, loc, tel, movil, fax, email, total + ""};
		return datos;
	}

	public String[] sacarDatosClientes(String codigo) throws SQLException {
		String all = "select * from clientes where codigo=" + codigo;
		String nif = null;
		String ape = null;
		String nom = null;
		String dom = null;
		String cp = null;
		String loc = null;
		String tel = null;
		String movil = null;
		String fax = null;
		String email = null;
		double total = 0;
		ResultSet listaMovimientos = con.createStatement().executeQuery(all);
		while (listaMovimientos.next()) {
			nif = listaMovimientos.getString("nif");
			ape = listaMovimientos.getString("apellidos");
			nom = listaMovimientos.getString("nombre");
			dom = listaMovimientos.getString("domicilio");
			cp = listaMovimientos.getString("codigo_postal");
			loc = listaMovimientos.getString("localidad");

			email = listaMovimientos.getString("email");
			total = listaMovimientos.getDouble("total_ventas");
		}
		nif = nif.substring(0, 8);
		String[] datos = {nif, ape, nom, dom, cp, loc, tel, movil, fax, email, total + ""};
		return datos;
	}
	
	public static String[] sacarDatosClientesSt(String codigo) throws SQLException {
		String all = "select * from clientes where codigo=" + codigo;
		/*String ape = "select apellidos from clientes where codigo="+codigo;
		 String nom = "select nombre from clientes where codigo="+codigo;
		 String dom = "select domicilio from clientes where codigo="+codigo;
		 String cp = "select codigo_postal from clientes where codigo="+codigo;
		 String loc = "select localidad from clientes where codigo="+codigo;
		 String tel = "select telefono from clientes where codigo="+codigo;
		 String movil = "select movil from clientes where codigo="+codigo;
		 String fax = "select nif from clientes where codigo="+codigo;
		 String email = "select email from clientes where codigo="+codigo;*/
		String nif = null;
		String ape = null;
		String nom = null;
		String dom = null;
		String cp = null;
		String loc = null;
		String tel = null;
		String movil = null;
		String fax = null;
		String email = null;
		ResultSet listaMovimientos;
		listaMovimientos = sts.executeQuery(all);
		while (listaMovimientos.next()) {
			nif = listaMovimientos.getString("nif");
			ape = listaMovimientos.getString("apellidos");
			nom = listaMovimientos.getString("nombre");
			dom = listaMovimientos.getString("domicilio");
			cp = listaMovimientos.getString("codigo_postal");
			loc = listaMovimientos.getString("localidad");
			tel = listaMovimientos.getString("telefono");
			movil = listaMovimientos.getString("movil");
			fax = listaMovimientos.getString("fax");
			email = listaMovimientos.getString("email");
		}
		nif = nif.substring(0, 8);
		String[] datos = {nif, ape, nom, dom, cp, loc, tel, movil, fax, email};
		return datos;
	}
	
	public List<Articulo> devolverArticulos() throws SQLException{
		String sql = "SELECT * FROM articulo";
		ResultSet rs = st.executeQuery(sql);
		List l = new ArrayList<Articulo>();
		while(rs.next())
			l.add(new Articulo(rs.getString("codigo"), rs.getString("descripcion"),
					rs.getInt("stock"), rs.getInt("stock_min"), rs.getDouble("pc"),
					rs.getDouble("pv")));
		return l;
	}
	
	public void meterArticulo(String codigoArticulo, String codigoPJ, String Cantidad, boolean clienteProveedor) throws SQLException{
		int cantidad = Integer.parseInt(Cantidad);
		
		String sql = clienteProveedor
					 ? "INSERT INTO historico (id_cliente,id_proveedor,id_articulo,cantidad,fecha) VALUES  (?,NULL,?,?,?)" 
					 : "INSERT INTO historico (id_cliente,id_proveedor,id_articulo,cantidad,fecha) VALUES (NULL,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, codigoPJ);
		ps.setString(2, codigoArticulo);
		ps.setInt(3, cantidad);
		ps.setDate(4, new java.sql.Date(new Date().getTime()));
		
		ps.executeUpdate();
		
		String sql2 = clienteProveedor
					  ?"SELECT stock, pv FROM articulo WHERE codigo = \'" + codigoArticulo + "\'"
					  :"SELECT stock, pc FROM articulo WHERE codigo = \'" + codigoArticulo + "\'";
		
		ResultSet rs = st.executeQuery(sql2);
		
		rs.next();
		
		int stock = rs.getInt(1);
		double pvc = rs.getDouble(2);
		
		sql = clienteProveedor
			  ? "UPDATE articulo SET stock = stock - ? WHERE codigo = ?"
			  : "UPDATE articulo SET stock = stock + ? WHERE codigo = ?";
		
		ps = con.prepareStatement(sql);
		
		ps.setInt(1, cantidad);
		ps.setString(2, codigoArticulo);
		
		ps.executeUpdate();
		
		sql = clienteProveedor
			  ? "UPDATE clientes SET total_ventas = total_ventas + ? WHERE codigo = ?" 
			  : "UPDATE proveedores SET total_ventas = total_ventas + ? WHERE codigo = ?";
		
		ps = con.prepareStatement(sql);
		
		ps.setDouble(1, (cantidad * pvc));
		ps.setString(2, codigoPJ);
		
		ps.executeUpdate();
	}

	boolean checkArticulo(String text) throws SQLException {
		String sql = "SELECT * FROM articulo WHERE codigo = \'" + text + "\'";
		ResultSet rs = st.executeQuery(sql);
		return rs.next();
	}
	
	public String[] getArticuloByCodigo(String codigo) throws SQLException{
		String sql = "SELECT * FROM articulo WHERE codigo = \'" + codigo + "\'";
		ResultSet rs = st.executeQuery(sql);
		String[] articulo = new String[6];
		if(rs.next()){
		articulo[0] = rs.getString(1);
		articulo[1] = rs.getString(2);
		articulo[2] = rs.getInt(3) + "";
		articulo[3] = rs.getInt(4) + "";
		articulo[4] = rs.getDouble(5) + "";
		articulo[5] = rs.getDouble(6) + "";
		return articulo;
		}
		else 
			return null;
	}

	public boolean checkCodigoCliente(String text) throws SQLException {
	String sql = "select codigo from clientes where codigo = " + text;
		ResultSet rs = st.executeQuery(sql);
		return rs.next();	
	}


	public String generarLetraDNI(String dni){
		String cadena = "TRWAGMYFPDXBNJZSQVHLCKET";
		int dnii = Integer.parseInt(dni) % 23;
		return cadena.charAt(dnii) + "";
	}
	
	public void meterVentaInternet(List<Articulo> compra, String codCliente) throws SQLException{
		String sql = "INSERT INTO pedidosInternet VALUES(?,?,?,?)";
		for(Articulo a : compra){
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, codCliente);
			ps.setString(2, a.codigo);
			ps.setString(3, a.cantidad);
			ps.setDate(4, new java.sql.Date(new Date().getTime()));
		}
	}
}
