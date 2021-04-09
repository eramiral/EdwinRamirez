package Clase3Metodos;

import java.util.Scanner;

public class Recibe2EnterosyRetornaMultiplicacion {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num1 = input.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = input.nextInt();


        System.out.println("la multiplicacion es "  + Multiplicacion(num1,num2));

    }
    public static int Multiplicacion (int numero1, int numero2 ) {
        return numero1 * numero2;

    }


}




