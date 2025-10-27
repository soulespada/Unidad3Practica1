package com.ieschabas;
import java.util.Random;
import java.util.Scanner;
/**
 * Clase Main que muestra un numero par aleatorio menor que el que el usuario introduce
 * @author Adrian
 * @version 1.0
 */
public class MainAleatoriosPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int limite = 0;
        boolean comprobar = true;
        //comprobamos que sea positivo el numero
      while(true){
          System.out.println("Introduce un numero: ");
           limite = scan.nextInt();
        if (limite<=0){
            comprobar=false;
            System.out.println("El numero tiene que ser mayor a 0");
        }else break;
      }

      AleatoriosPar aleatoriosPar = new AleatoriosPar();
      Random rng = new Random();
      //usamos el metodo
      aleatoriosPar.parAleatorioMenorQue(limite,rng);
    }
}
