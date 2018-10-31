/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Venta implements Serializable {
	private int localizacion;
	private int procesador;
	private int ram;
	private int monitor;
	private int almacenamiento;
	private boolean otro1;
	private boolean otro2;
	private boolean otro3;
	private boolean otro4;

	public Venta(int localizacion, int procesador, int ram, int monitor, int almacenamiento, boolean otro1, boolean otro2, boolean otro3, boolean otro4) {
		this.localizacion = localizacion;
		this.procesador = procesador;
		this.ram = ram;
		this.monitor = monitor;
		this.almacenamiento = almacenamiento;
		this.otro1 = otro1;
		this.otro2 = otro2;
		this.otro3 = otro3;
		this.otro4 = otro4;
	}

	public int getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(int localizacion) {
		this.localizacion = localizacion;
	}

	public int getProcesador() {
		return procesador;
	}

	public void setProcesador(int procesador) {
		this.procesador = procesador;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getMonitor() {
		return monitor;
	}

	public void setMonitor(int monitor) {
		this.monitor = monitor;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public boolean isOtro1() {
		return otro1;
	}

	public void setOtro1(boolean otro1) {
		this.otro1 = otro1;
	}

	public boolean isOtro2() {
		return otro2;
	}

	public void setOtro2(boolean otro2) {
		this.otro2 = otro2;
	}

	public boolean isOtro3() {
		return otro3;
	}

	public void setOtro3(boolean otro3) {
		this.otro3 = otro3;
	}

	public boolean isOtro4() {
		return otro4;
	}

	public void setOtro4(boolean otro4) {
		this.otro4 = otro4;
	}
	
}
