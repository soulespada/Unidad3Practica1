package com.ieschabas;
import java.util.Random;
/**
 * Clase que devuelve la suma de dos Randoms y la almacena en un array de x posiciones
 * @author Adrian
 * @version 1.0
 */
public class SumasAleatorias {
    /**
     * Metodo que devuelve la suma de 2 randoms
     * @param rng
     * @return
     */
    public int sumaDosAleatorios(Random rng){
        int a = rng.nextInt(1001);
        int b = rng.nextInt(1001);

        return a+b;
    }

    /**
     * Metodo que devuelve un Array con los resultados de las sumas de 2 randoms segun x repeticiones
     * @param repeticiones
     * @param rng
     * @return resultados
     */
    public int[] generarSumas(int repeticiones, Random rng){
        int[] resultados = new int[repeticiones];
        for (int i=0; i<repeticiones;i++){
            //rellena el array con las sumas
            resultados[i]=sumaDosAleatorios(rng);
        }return resultados;
    }
}
