package Clase3Metodos;

import java.util.Scanner;

public class CalcularIvadeSueldo {

    public static float IVA = 19;

    public static void main(String args[] ){

        Scanner intput = new Scanner(System.in);
        System.out.println("Ingrese sueldo" );
        int sueldo = intput.nextInt();

        System.out.println("El Iva del sueldo ingresado es " + calculaIVA(sueldo));

    }

    public static float calculaIVA(float sueldo){
        float calculo = IVA * sueldo/ 100;
        return calculo;

    }
}
