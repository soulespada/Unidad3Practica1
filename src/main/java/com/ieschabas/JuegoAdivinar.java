package com.ieschabas;
import java.util.Scanner;
/**
 * Clase que comprueba si un numero coincide con uno secreto segun x intentos y almacena los intentos en un Array
 * @author Adrian
 * @version 1.0
 */
public class JuegoAdivinar {
    private int contador = 0;

    /**
     * Metodo que muestra si el numero es mayor o menor que el introducido o si es el mismo
     * @param secreto
     * @param intento
     */
    public void evaluarIntento(int secreto, int intento) {

            if (intento < secreto) {
                System.out.println("El numero es menor."+" Has realizado "+(contador+1)+" intentos.");
            } else if (intento > secreto) {
                System.out.println("El numero es mayor."+" Has realizado "+(contador+1)+" intentos.");
            } else {
                System.out.println("Has acertado!"+" Has realizado "+(contador+1)+" intentos.");
            }
            contador++;
        System.out.println();
        }

    /**
     * Metodo que almacena numeros que son 9 intentos del usuario en un array y devuelve el numero de intentos o -1 si excedes los intentos
     * @param secreto
     * @param intentos
     * @return contador
     */
    public int jugar(int secreto, int[] intentos) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tienes 9 intentos");

        for (int i = 0; i <= intentos.length; i++) {
            if (intentos[i]==-5){
                contador=-1;
                System.out.println("Has agotado el limite de intentos.");break;}
            System.out.println("Introduce un numero");

            int intento = scan.nextInt();


            intentos[i] = intento;
            evaluarIntento(secreto, intento);
            if(secreto==intentos[i]){break;}
        }
            return contador;

    }
}





