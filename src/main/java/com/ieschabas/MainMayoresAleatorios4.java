package com.ieschabas;
import java.util.Random;
import java.util.Scanner;
/**
 * Clase Main que muestra el mayor de 4 randoms segun repeticiones
 * @author Adrian
 * @version 1.0
 */
public class MainMayoresAleatorios4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rng = new Random();
        int repeticiones = 0;
        //bucle para comprobar que sea un positivo
        while (true) {
            System.out.println("Introduce un numero de repeticiones: ");
            repeticiones = scan.nextInt();
            if (repeticiones <= 0) {
                System.out.println("Las repeticiones debe ser un numero positivo ");
            } else {
                break;
            }
        }
        MayoresAleatorios4 mayoresAleatorios4 = new MayoresAleatorios4();
        //usamos el metodo y usamos un for para mostrar los valores del array
        int []mayores = mayoresAleatorios4.generarMaximos4(repeticiones,rng);
        for (int mayor:mayores){
            System.out.println(mayor);
        }
    }
}
