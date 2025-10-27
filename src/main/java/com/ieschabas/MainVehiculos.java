package com.ieschabas;
import java.util.Scanner;

/**
 * Clase Main que imprime por pantalla un String determinado segun introduzca el usuario un numero del 1 al 4
 * @author Adrian
 * @version 1.0
 */
public class MainVehiculos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;
        //creamos bucle que no pare mientras sea distinto de 4 el input
        do {
            System.out.println("Introduce una opción y saldrá por pantalla");
            System.out.println("- Opción 1 → \"Mantenimiento de clientes\"\n" +
                    "- Opción 2 → \"Introducción de facturas\"\n" +
                    "- Opción 3 → \"Listado de facturas\"\n" +
                    "- Opción 4 → \"Finalizar\"\n" +
                    "- Otros valores imprimen un mensaje indicando “La opción no existe. Vuelve a intentarlo”.\n");
            opcion = scan.nextInt();
            MenuVehiculos menu = new MenuVehiculos();
            System.out.println(menu.seleccionarOpcion(opcion));
        } while (opcion != 4);

    }
}