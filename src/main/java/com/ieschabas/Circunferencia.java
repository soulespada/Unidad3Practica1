package com.ieschabas;

/**
 * Clase que calcula el area y longitud de una circunferencia
 * @author Adrian
 * @version 1.0
 */
public class Circunferencia {
    /**
     * Metodo que calcula el area de una circunferencia
     * @param radio
     * @return area
     */
    public double area(double radio){
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * Metodo que calcula la longitud de una circunferencia
     * @param radio
     * @return longitud
     */
    public double longitud(double radio){
        return 2*Math.PI*radio;
    }
}
