package com.cr.test;

import java.util.Scanner;

import com.cr.tablas.tablasDeMultiplicar;

public class test {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de la tabla que quiere conocer : ");
        int numero = sc.nextInt();

        tablasDeMultiplicar.mostrarTabla(numero);
    }
}
