package com.ieschabas;
import java.util.Scanner;
/**
 * Clase Main que muestra el mayor entre dos numeros
 * @author Adrian
 * @version 1.0
 */
public class MainMayores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce dos numeros: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        Mayores mayores = new Mayores();
        //usamos el metodo de la clase mayores para imprimir
        System.out.println("El numero mas grande entre "+a+" y "+b+" es: "+mayores.max2(a,b));
    }
}
