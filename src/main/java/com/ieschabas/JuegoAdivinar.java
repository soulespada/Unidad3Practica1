package com.ieschabas;

/**
 * Clase que comprueba si un numero coincide con uno secreto segun x intentos y almacena los intentos en un Array
 * @author Adrian
 * @version 1.0
 */
public class JuegoAdivinar {
    private int contador = 0;

    /**
     * Metodo que muestra si el numero es mayor o menor que el introducido o si es el mismo
     * @param secreto numero secreto a adivinar
     * @param intento intento actual del jugador
     */
    public void evaluarIntento(int secreto, int intento) {
        if (intento < secreto) {
            System.out.println("El número es menor. Has realizado " + (contador + 1) + " intentos.");
        } else if (intento > secreto) {
            System.out.println("El número es mayor. Has realizado " + (contador + 1) + " intentos.");
        } else {
            System.out.println("¡Has acertado! Has realizado " + (contador + 1) + " intentos.");
        }
        contador++;
        System.out.println();
    }

    /**
     * Métode que evalúa una lista de intentos
     *
     * @param secreto número secreto
     * @param intentos array con los intentos del jugador
     * @return número del intento acertado o -1 si no se acierta
     */
    public int jugar(int secreto, int[] intentos) {
        if (intentos == null) {
            return -1;
        }

        for (int i = 0; i < intentos.length; i++) {
            int intento = intentos[i];
            evaluarIntento(secreto, intento);

            if (secreto == intento) {
                return i + 1; // número del intento (no índice)
            }
        }

        // si no acierta ninguno
        return -1;
    }
}
