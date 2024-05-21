package com.cr.test;

import java.util.Scanner;

public class test {

  public static void main(String[] args) {
    @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese un número: ");
    int numero = scanner.nextInt();

    boolean esPrimo = com.cr.primo.Proyecto.esPrimo(numero); // Corrected call
    String mensaje = (esPrimo) ? numero + " es un número primo" : numero + " no es un número primo";
    System.out.println(mensaje);
  }
}
