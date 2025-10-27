package com.ieschabas;

/**
 * Clase que elige entre 4 Strings determinados para devolver de una aplicacion de vehiculos
 * @author Adrian
 * @version 1.0
 */
public class MenuVehiculos {
    public MenuVehiculos(){};

    /**
     * Metodo que devuelve un String determinado segun opcion
     * @param opcion
     * @return
     */
    public String seleccionarOpcion(int opcion){
            switch (opcion){
                case 1:return "Opcion 1->Mantenimiento de clientes";

                case 2:return "Opcion 2->Introducción de facturas";

                case 3:return "Opcion 3->Listado de facturas";

                case 4:return "Opcion 4->Finalizar";

                default:return "La opcion no existe. Vuelve a intentarlo.";

            }


    }
}

