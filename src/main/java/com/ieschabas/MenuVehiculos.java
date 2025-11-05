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
                case 1:return "Mantenimiento de clientes";

                case 2:return "Introducción de facturas";

                case 3:return "Listado de facturas";

                case 4:return "Finalizar";

                default:return "La opcion no existe. Vuelve a intentarlo";

            }


    }
}

