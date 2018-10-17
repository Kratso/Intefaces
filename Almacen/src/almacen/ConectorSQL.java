/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author alumno
 */
public class ConectorSQL {
    private Connection con;
    public Statement st; 
    
    public void conectarDB() throws Exception{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        con=DriverManager.getConnection("jdbc:mysql://localhost/desarrolloInterfaces","root","manager");
        //con.setAutoCommit(true); //Cada vez que hagamos una operación, necesitmaos hacer un commit() para guardar.
        st=con.createStatement();
    }
    
    public void crearTabla() throws SQLException{
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
    
    public void insertarVenta(String codigo, String nif, String apellidos, String nombre, String domicilio, String cp, String localidad, String telefono, String movil, String fax, String email, String ventas ) throws SQLException{
        String sentencia= "insert into clientes()"
                + "values('"+codigo+"','"+nif+"','"+apellidos+"','"+nombre+"','"+domicilio+"','"+cp+"','"+localidad+"','"+telefono+"','"+movil+"','"+fax+"','"+email+"','"+ventas+"')";
        st.executeUpdate(sentencia);
    }
    
    public void modCliente(String codigo, String nif, String apellidos, String nombre, String domicilio, String cp, String localidad, String telefono, String movil, String fax, String email, String ventas ) throws SQLException{
        String sentencia="update clientes set nif='"+nif+"',apellidos='"+apellidos+"',nombre='"+nombre+"',"+"domicilio='"+domicilio+"',codigo_postal='"+cp+"',localidad='"+localidad+"',telefono='"+telefono+"',movil='"+movil+"',fax='"+fax+"',email='"+email+"',total_ventas='"+ventas+"' where codigo='"+codigo+"'";
        st.executeUpdate(sentencia);
    }
    
    public void borrarCliente(String codigo) throws SQLException{
        String sentencia ="delete from clientes where codigo = "+codigo+";";
        st.executeUpdate(sentencia);
    }
    
    public String[] sacarDatos(String codigo) throws SQLException{
        String all = "select * from clientes where codigo="+codigo;
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
        ResultSet listaMovimientos = st.executeQuery(all);
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
        String [] datos = {nif,ape,nom,dom,cp,loc,tel,movil,fax,email};
        return datos;
    }
}
