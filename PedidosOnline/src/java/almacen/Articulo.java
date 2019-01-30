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
public class Articulo {
	public String codigo;
	public String descripcion;
	public int stock;
	public int stock_min;
	public double pc;
	public double pv;
	public String cantidad;
	public String importe;

	public Articulo(String codigo, String descripcion, int stock, int stock_min, double pc, double pv) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.stock = stock;
		this.stock_min = stock_min;
		this.pc = pc;
		this.pv = pv;
	}
	
	public Articulo(String[] data, String cantidad, String importe){
		this.codigo = data[0];
		this.descripcion = data[1];
		this.stock = Integer.parseInt(data[2]);
		this.stock_min = Integer.parseInt(data[3]);
		this.pc = Double.parseDouble(data[4]);
		this.pv = Double.parseDouble(data[5]);
		this.cantidad = cantidad;
		this.importe = importe;
	}
	
	
}
