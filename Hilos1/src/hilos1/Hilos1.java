/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos1;

import java.awt.BorderLayout;

/**
 *
 * @author alumno
 */
public class Hilos1 {

	public static void main(String args[]) {
		Runnable r = () -> (System.out.println("jaja"));
		new Thread(r).start();
		System.out.println("Hola desde el hilo principal!");
		System.out.println("Proceso acabando.");
	}

}


