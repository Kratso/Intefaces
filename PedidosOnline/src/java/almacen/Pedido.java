/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

/**
 *
 * @author alumno
 */
public class Pedido {
	public String cliente;
	public String articulo;
	public int cantidad;
	public String fecha;

	public Pedido(String cliente, String articulo, int cantidad, String fecha) {
		this.cliente = cliente;
		this.articulo = articulo;
		this.cantidad = cantidad;
		this.fecha = fecha;
	}
}
