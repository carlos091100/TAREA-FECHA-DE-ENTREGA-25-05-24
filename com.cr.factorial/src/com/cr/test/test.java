package com.cr.test;

import java.util.Scanner;
import com.cr.factorial.Factorial;

public class test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("ingrese un numero: ");
		int numero = scanner.nextInt();
		
		int factorial = Factorial.factorial(numero);
		System.out.println("el factorial de "+numero+" es "+factorial);

	}

	
}

