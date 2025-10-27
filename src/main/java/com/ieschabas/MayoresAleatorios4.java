package com.ieschabas;
import java.util.Random;
/**
 * Clase que calcula el mayor de 4 numeros random
 * @author Adrian
 * @version 1.0
 */
public class MayoresAleatorios4 {
    /**
     * Metodo que devuelve el mayor de 4 numeros
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     */
    public int max4(int a,int b, int c, int d){
        if(a>b&&a>c&&a>d){return a;}
        else if (b>a&&b>c&&b>d) {return b;
        }else if(c>a&&c>b&&c>d){ return c;}
        else {return d;}

    }

    /**
     * Metodo que devuelve un array de los mayores 4 numeros segun x repeticiones
     * @param repeticiones
     * @param rng
     * @return mayores
     */
    public int[] generarMaximos4(int repeticiones, Random rng){
        //le asignamos al array tantos espacios como repeticiones
        int[] mayores = new int[repeticiones];
        //recorremos el array usando el metodo max4
        for (int i=0; i<repeticiones;i++){
            mayores[i]=max4(rng.nextInt(1001), rng.nextInt(1001), rng.nextInt(1001), rng.nextInt(1001));
        }return mayores;
    }
}
