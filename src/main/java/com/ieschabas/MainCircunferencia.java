package com.ieschabas;
import java.util.Scanner;
/**
 * Clase Main que muestra el area y longitud de una circunferencia
 * @author Adrian
 * @version 1.0
 */
public class MainCircunferencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int radio = 0;
        Circunferencia circunferencia = new Circunferencia();
        //comprobamos que el numero sea positivo
        while (true){
            System.out.println("Introduce un radio: ");
            radio= scan.nextInt();
            if(radio<=0){
                System.out.println("El radio debe ser positivo");
            }else {break;}
        }
        //usamos el metodo area y longitud del objeto circunferencia
        System.out.println("El area es: "+circunferencia.area(radio));
        System.out.println("La longitud es: "+circunferencia.longitud(radio));

    }
}
