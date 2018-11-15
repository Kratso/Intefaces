/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author alumno
 */
public class jFormController {

	public static final int CODIGO = 0;
	public static final int NIF = 1;
	public static final int NOMBRE = 2;
	public static final int APELLIDO = 3;
	public static final int DOMICILIO = 4;
	public static final int CP = 5;
	public static final int LOCALIDAD = 6;
	public static final int TELEFONO = 7;
	public static final int MOVIL = 8;
	public static final int FAX = 9;
	public static final int EMAIL = 10;

	public static final int NO_ERROR = 0;
	public static final int CONTENT_ERROR = 1;
	public static final int LONG_ERROR = 2;

	private static Connection c;

	public static int validacion(int id, String content) {
		switch (id) {
			case CODIGO:
				return testCodigo(content);
			case NIF:
				return testNif(content);
			case NOMBRE:
				return testNombre(content);
			case APELLIDO:
				return testApellido(content);
			case DOMICILIO:
				return NO_ERROR;
			case CP:
				return testCP(content);
			case LOCALIDAD:
				return testLocalidad(content);
			case TELEFONO:
			case MOVIL:
			case FAX:
				return testTelefono(content);
			case EMAIL:
				return NO_ERROR;
			default:
				return NO_ERROR;
		}
	}

	private static int testCodigo(String content) {
		int resul = content.length() <= 6 && content.matches("[0-9]{6}") ? NO_ERROR : CONTENT_ERROR;
		return resul;
	}

	private static int testNif(String content) {
		if (content.matches("[0-9]{1,8}")) {
			return NO_ERROR;
		} else {
			return content.length() > 8 || content.length() <= 0 ? LONG_ERROR : CONTENT_ERROR;
		}
	}

	private static int testNombre(String content) {
		if (content.trim().matches("([A-Za-z]+[ ]?)+")) {
			return NO_ERROR;
		} else {
			return CONTENT_ERROR;
		}
	}

	private static int testCP(String content) {
		if (content.trim().matches("[0-9]{5}")) {
			return NO_ERROR;
		} else if (!content.trim().matches("[0-9]*")) {
			return CONTENT_ERROR;
		} else {
			return LONG_ERROR;
		}
	}

	private static int testTelefono(String content) {
		if (!content.trim().matches("[0-9]*")) {
			return CONTENT_ERROR;
		} else if (content.trim().matches("[0-9]{0,9}")) {
			return NO_ERROR;
		}
		return 0;
	}

	private static int testLocalidad(String content) {
		return testNombre(content);
	}

	static String letraNif(String text) {
		String[] letra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D",
						  "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		return letra[Integer.parseInt(text) % 23];
	}

	private static int testApellido(String content) {
		if (content.trim().matches("([A-Za-z.\\-]+[ ]?)+")) {
			return NO_ERROR;
		} else {
			return CONTENT_ERROR;
		}
	}

	static void instanceConnection() {
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost/interface", "root", "manager");
			c.setAutoCommit(false);

		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			System.out.println(e.getMessage());
		}
	}

	static boolean testForCode(String codigo) throws SQLException {
		String sql = "SELECT Codigo FROM Clientes WHERE Codigo = \"" + codigo + "\";";
		ResultSet rs = c.createStatement().executeQuery(sql);
		return rs.next();
	}

	static void insertCliente(String data) throws SQLException {
		String sql = "INSERT INTO Clientes values " + data;
		System.out.println(sql);
		c.createStatement().execute(sql);
		c.commit();
	}
	
	static void updateCliente(String data) throws SQLException {
		String[] info = data.replaceAll("[\\\\[\\\\](\\\\'\\\\( \\\\);]","").split("[,]");
		System.out.println(info.length);
		List<String> mod = new ArrayList<>(Arrays.asList(info));
		for(String s : mod)
			s = s.replaceAll("[\"\\\\;]", "");
		mod.forEach(System.out::println);
		String sql = "UPDATE Clientes SET Nif = ?, Apellidos = ?, Nombre = ?,"
				+ " Domicilio = ?, CP = ?, Localidad = ?, Telefono = ?, "
				+ "Movil = ?, Fax = ?, Email = ?, Total = ? WHERE Codigo = ?;";
		PreparedStatement ps = c.prepareStatement(sql);
		
		for(int i = 1; i < mod.size() - 1; i++){
			ps.setString((i)%(mod.size() - 1), mod.get(i));
		}
		ps.setDouble(11, Double.parseDouble(mod.get(11)));
		ps.setString(12, mod.get(0));
		
		ps.executeUpdate();
		c.commit();
	}

	static String[] recuperarFila(String text) throws SQLException {
		ResultSet rs = c.createStatement().executeQuery("SELECT * FROM Clientes WHERE Codigo = "
														+ text + ";");
		String[] result = new String[12];
		if (rs.next()) {
			result[0] = rs.getString("Codigo");
			result[1] = rs.getString("Nif");
			result[2] = rs.getString("Apellidos");
			result[3] = rs.getString("Nombre");
			result[4] = rs.getString("Domicilio");
			result[5] = rs.getString("CP");
			result[6] = rs.getString("Localidad");
			result[7] = rs.getString("Telefono");
			result[8] = rs.getString("Movil");
			result[9] = rs.getString("Fax");
			result[10] = rs.getString("Email");
			result[11] = rs.getString("Total");
			System.out.println(Arrays.toString(result));
		}
		return result;
	}
}
