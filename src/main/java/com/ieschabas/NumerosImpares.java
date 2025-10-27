package com.ieschabas;

/**
 * Clase que multiplica los diez primeros numeros impares
 * @author Adrian
 * @version 1.0
 */
public class NumerosImpares {

    private long resultado;
    public NumerosImpares(){};
    public NumerosImpares(long resultado) {
        this.resultado = resultado;
    }

    /**
     * Getters
     * @return resultado
     */
    public long getResultado() {
        return resultado;
    }

    /**
     * Setters
     * @param resultado
     */
    public void setResultado(long resultado) {
        this.resultado = resultado;
    }

    /**
     * Metodo que devuelve el resultado de los diez primeros numeros impares positivos
     * @return resultado
     */
    public long productoDiezPrimerosImpares(){
        int contador = 0;
        setResultado(1);
        //comprueba que sea impar y lo va multiplicando
        for(int i =1;i<=19;i++){
            if(i%2!=0){
                setResultado(resultado*i);
                contador++;

                if(contador==10){break;}
            }
        }return getResultado();

    }
}
