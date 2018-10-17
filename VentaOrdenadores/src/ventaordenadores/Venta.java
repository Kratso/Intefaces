/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventaordenadores;

/**
 *
 * @author alumno
 */
public class Venta {
    //Atributos
    String nombreCliente;
    int localidad;
    String procesador;
    String memoria;
    String monitor;
    String discoDuro;
    boolean grabadora;
    boolean wifi;
    boolean sintonizador;
    boolean backup;
    
    //Constructores.
    public Venta(String nombreCliente, int localidad,String procesador,String memoria, String monitor, String discoDuro, boolean grabadora, boolean wifi, boolean sintonizador, boolean backup)
    {
        this.nombreCliente=nombreCliente;
        this.localidad=localidad;
        this.procesador=procesador;
        this.memoria=memoria;
        this.monitor=monitor;
        this.discoDuro=discoDuro;
        this.grabadora=grabadora;
        this.wifi=wifi;
        this.sintonizador=sintonizador;
        this.backup=backup;
    }
    
    public String getNombreCliente()
    {
        return this.nombreCliente;
    }

    public int getLocalidad() {
        return localidad;
    }

    public void setLocalidad(int localidad) {
        this.localidad = localidad;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public boolean isGrabadora() {
        return grabadora;
    }

    public void setGrabadora(boolean grabadora) {
        this.grabadora = grabadora;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public boolean isBackup() {
        return backup;
    }

    public void setBackup(boolean backup) {
        this.backup = backup;
    }
    
    
}
