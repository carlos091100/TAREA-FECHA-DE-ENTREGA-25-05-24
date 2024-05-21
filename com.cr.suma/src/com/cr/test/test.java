package com.cr.test;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        int suma = com.cr.suma.suma.sumar(numero1, numero2);

        System.out.println("La suma es de: " + suma);
    }
}
