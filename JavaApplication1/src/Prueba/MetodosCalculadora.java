/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class MetodosCalculadora {
    //Método que recibe un objeto JLabel y un String, y según el valor del String se utilizará de un modo u otro el contenido del JLabel, para modificar el propio contenido de este. Devolverá el String "terminado".
    public static String pulsaIgual(String operacion, String estado) throws Exception
    {
        //Según el contenido del String el método actuará de distinta forma.
        switch(estado)
        {
            case "sumando"://Si recibe el valor "sumando" por parte del String, sumará los valores reales separados por el signo "+" que contiene el objeto JLabel.
                String [] splitter = operacion.split("\\+");//Guarda como datos de tipo String lo que haya entre signos "+" dentro del JLabel.
                if(Double.valueOf(splitter[0])==0 || Double.valueOf(splitter[1])==0)//Comprobamos que ningún operando sea 0.
                {
                    throw new Exception("Operación inválida, 0 no puede ser un operando. Pulse 'BORRAR' para volver a operar.");//Creamos la excepción si un operando es 0.
                }
                double resul = Double.valueOf(splitter[0]) + Double.valueOf(splitter[1]);//Suma los reales guardados en los String anteriormente.
                operacion=""+resul;//Modifica el contenido de la etiqueta JLabel al resultado de la operación anterior.
                break;
            case "restando"://Si recibe el valor "restando" por parte del String, restará los valores reales separados por el signo "-" que contiene el objeto JLabel.
                String [] splitter2 = operacion.split("\\-");//Guarda como datos de tipo String lo que haya entre signos "-" dentro del JLabel.
                if(Double.valueOf(splitter2[0])==0 || Double.valueOf(splitter2[1])==0)//Comprobamos que ningún operando sea 0.
                {
                    throw new Exception("Operación inválida, 0 no puede ser un operando. Pulse 'BORRAR' para volver a operar.");//Creamos la excepción si un operando es 0.
                }
                double resul2 = Double.valueOf(splitter2[0]) - Double.valueOf(splitter2[1]);//Resta los reales guardados en los String anteriormente.
                operacion=""+resul2;//Modifica el contenido de la etiqueta JLabel al resultado de la operación anterior.
                break;
            case "multiplicando"://Si recibe el valor "multiplicando" por parte del String, multiplicará los valores reales separados por el signo "x" que contiene el objeto JLabel.
                String [] splitter3 = operacion.split("x");//Guarda como datos de tipo String lo que haya entre signos "x" dentro del JLabel.
                if(Double.valueOf(splitter3[0])==0 || Double.valueOf(splitter3[1])==0)//Comprobamos que ningún operando sea 0.
                {
                    throw new Exception("Operación inválida, 0 no puede ser un operando. Pulse 'BORRAR' para volver a operar.");//Creamos la excepción si un operando es 0.
                }
                double resul3 = Double.valueOf(splitter3[0]) * Double.valueOf(splitter3[1]);//Multiplica los reales guardados en los String anteriormente.
                operacion=""+resul3;//Modifica el contenido de la etiqueta JLabel al resultado de la operación anterior.
                break;
            case "dividiendo"://Si recibe el valor "dividiendo" por parte del String, dividirá los valores reales separados por el signo ࠢ/" que contiene el objeto JLabel.
                String [] splitter4 = operacion.split("/");//Guarda como datos de tipo String lo que haya entre signos "/" dentro del JLabel.
                if(Double.valueOf(splitter4[0])==0 || Double.valueOf(splitter4[1])==0)//Comprobamos que ningún operando sea 0.
                {
                    throw new Exception("Operación inválida, 0 no puede ser un operando. Pulse 'BORRAR' para volver a operar.");//Creamos la excepción si un operando es 0.
                }
                double resul4 = Double.valueOf(splitter4[0]) / Double.valueOf(splitter4[1]);//Divide los reales guardados en los String anteriormente.
                operacion=""+resul4;//Modifica el contenido de la etiqueta JLabel al resultado de la operación anterior.
                break;
            case "terminado"://Si recibe el valor "terminado" por parte del String, saltará una excepción.
                throw new Exception("Operación terminada. Pulse 'BORRAR' para volver a operar.");//Creamos la excepción.
            default://Si recibe un valor que no sea igual a los anteriores por parte del String, saltará una excepción.
                throw new Exception("No ha concretado ninguna operación.");//Creamos la excepción.
        }
        //Si todo transcurre con normalidad y no salta ninguna de las excepciones, el método devolverá el String "terminado".
        return operacion;
    }
}
