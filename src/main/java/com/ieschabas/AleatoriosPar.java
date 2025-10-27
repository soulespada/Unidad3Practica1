package com.ieschabas;
import java.util.Random;
/**
 * Clase que crea un int random par menor que un limite establecido
 * @author Adrian
 * @version 1.0
 */
public class AleatoriosPar {
    /**
     * Metodo que devuelve un random menor que un limite establecido
     * @param limite
     * @param rng
     * @return resultado
     */
    public int parAleatorioMenorQue(int limite, Random rng){
        int resultado = 0;
        do {
            resultado= rng.nextInt(limite);
        } while (resultado%2!=0);

            System.out.println(resultado);

        System.out.println(resultado);

    return resultado;
    }
}
