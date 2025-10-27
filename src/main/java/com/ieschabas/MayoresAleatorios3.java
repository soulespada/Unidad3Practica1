package com.ieschabas;
import java.util.Random;

/**
 * Clase que calcula el mayor de 4 numeros random
 * @author Adrian
 * @version 1.0
 */
public class MayoresAleatorios3 {
    /**
     * Metodo que devuelve el mayor de 3 numeros
     * @param a
     * @param b
     * @param c
     * @return
     */
    public int max3(int a,int b, int c){
        if(a>b&&a>c){return a;}
        else if (b>a&&b>c) {return b;
        }else{ return c;}

    }

    /**
     * Metodo que devuelve un array de cada mayor numero entre 3 segun x repeticiones
     * @param repeticiones
     * @param rng
     * @return mayores
     */
    public int[] generarMaximos3(int repeticiones, Random rng){
        int[] mayores = new int[repeticiones];
        for (int i=0; i<repeticiones;i++){
            mayores[i]=max3(rng.nextInt(1001), rng.nextInt(1001), rng.nextInt(1001));
        }return mayores;
    }
}
