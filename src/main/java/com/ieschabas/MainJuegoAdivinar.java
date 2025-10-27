package com.ieschabas;
import java.util.Random;
/**
 * Clase Main que crea un juego que le da 9 intentos al usuario para adivinar un numero del 1 al 10
 * @author Adrian
 * @version 1.0
 */
public class MainJuegoAdivinar {
    public static void main(String[] args) {

    JuegoAdivinar juegoAdivinar = new JuegoAdivinar();
        Random random = new Random();
        int secreto = random.nextInt(1,10);
        System.out.println(secreto);
        //creo la Array para 9 intentos
        int[] intentos = new int[10];
        intentos[9] = -5;
        juegoAdivinar.jugar(secreto,intentos);



    }
}
