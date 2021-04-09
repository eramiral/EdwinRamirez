package Clase2EjerciciosConFor;

import java.util.Scanner;

public class CalcularFactorialNumero5UsandoFor {

        public static void main(String args[]) {
        int factorial = 0;

            for (int i = 1; i <= 10;  i ++){
            factorial = factorial*i;

            }

            System.out.println("El factorial es " + factorial);
        }

    }
