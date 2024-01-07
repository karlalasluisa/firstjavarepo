package org.cuatrovientos.dam.entornosdesarrollo.ejemplomavenentornos;

/**
 * Hello world!
 *
 */

public class Calculadora 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculadora miCalculadora = new Calculadora();
        int resultado = 0;
        
        switch(args[0]) {
        case "sumar":
        	resultado = miCalculadora.sumar(args[1],args[2]);
        	break;
        case "restar":
        	resultado = miCalculadora.restar(args[1],args[2]);
        	break;
        case "multiplicar":
        	resultado = miCalculadora.multiplicar(args[1],args[2]);
        	break;
        case "dividir":
        	resultado = miCalculadora.dividir(args[2],args[1]);
        	break;
        default: 
        	break;
        }
        System.out.println("Resultado es: " + resultado);
    }
 
	private int dividir(String numero1, String numero2) {
		int numero1Int = Integer.valueOf(numero1);
		int numero2Int = Integer.valueOf(numero2); 
		return numero1Int / numero2Int;
	}

	private int multiplicar(String numero1, String numero2) {
		int numero1Int = Integer.valueOf(numero1);
		int numero2Int = Integer.valueOf(numero2); 
		return numero1Int * numero2Int;
	}

	private int restar(String numero1, String numero2) {
		int numero1Int = Integer.valueOf(numero1);
		int numero2Int = Integer.valueOf(numero2); 
		return numero1Int - numero2Int;
	}
/*
 * Operación que suma 2 números
 */

	/**
	 * Método para sumar 2 num
	 * @param numero1 el 1mer número a sumar
	 * @param numero2 el 2do número a sumar
	 * @return el num sumado
	 * TODO me falta validar que num1 y 2 sean números
	 */
	

	private int sumar(String numero1, String numero2) {
		 int numero1Int = Integer.valueOf(numero1); //FIXME da error cuando núm1 es una letra
		 int numero2Int = Integer.valueOf(numero2); //Recuperamos el 2do núm y lo convertimos a entero
		 return numero1Int + numero2Int; 
	}
}
