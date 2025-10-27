package com.ieschabas;
import java.util.Random;
import java.util.Scanner;
/**
 * Clase Main que muestra los valores de un Array que contiene las sumas de dos numeros aleatorios según x repeticiones
 * @author Adrian
 * @version 1.0
 */
public class MainSumasAleatorias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rng = new Random();
        int repeticiones;
        //Comprueba que sea positivo el numero de reps
        while (true){
            System.out.println("Introduce el numero de repeticiones: ");
            repeticiones= scan.nextInt();
            if(repeticiones<=0){
                System.out.println("El numero debe de ser mayor que 0");
            }else {
                break;
            }
        }

        SumasAleatorias sumasAleatorias = new SumasAleatorias();
        //Crea el Array de resultados y muestra sus valores por pantalla
        int [] resultados = sumasAleatorias.generarSumas(repeticiones,rng);
        for (int suma : resultados){
            System.out.println(suma);
        }
    }
}
