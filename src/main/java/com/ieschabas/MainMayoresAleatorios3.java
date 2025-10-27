package com.ieschabas;
import java.util.Random;
import java.util.Scanner;
/**
 * Clase Main que muestra el mayor de 3 randoms segun x repeticiones
 * @author Adrian
 * @version 1.0
 */
public class MainMayoresAleatorios3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rng = new Random();
        int repeticiones = 0;
        //obligamos al usuario a poner un numero positivo
        while (true){
            System.out.println("Introduce un numero de repeticiones: ");
            repeticiones= scan.nextInt();
            if(repeticiones<=0){
                System.out.println("Las repeticiones debe ser un numero positivo ");
            }else {break;}
        }

        MayoresAleatorios3 mayoresAleatorios3 = new MayoresAleatorios3();
        //usamos el metodo generarMaximos3 para crear un array que almacene los mayores
        int []resultados=mayoresAleatorios3.generarMaximos3(repeticiones,rng);
        //imprimimos el array
        for (int mayor :resultados){
            System.out.println(mayor);
        }
    }
}
