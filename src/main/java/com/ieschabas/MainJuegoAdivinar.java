package com.ieschabas;
import java.util.Random;
import java.util.Scanner;

/**
 * Clase Main que crea un juego que le da 9 intentos al usuario para adivinar un numero del 1 al 10
 * @author Adrian
 * @version 1.0
 */
public class MainJuegoAdivinar {
    public static void main(String[] args) {
        JuegoAdivinar juegoAdivinar = new JuegoAdivinar();
        Random random = new Random();
        int secreto = random.nextInt(1, 10);
        System.out.println(secreto); // opcional para depurar

        int[] intentos = new int[10];
        intentos[9] = -5; // marca de fin

        Scanner scan = new Scanner(System.in);
        System.out.println("Tienes 9 intentos");

        for (int i = 0; i < intentos.length - 1; i++) {
            System.out.print("Introduce un número: ");
            int intento = scan.nextInt();
            intentos[i] = intento;

            if (intento == secreto) break;
        }

        juegoAdivinar.jugar(secreto, intentos);
    }
}