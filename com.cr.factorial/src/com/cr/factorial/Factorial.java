package com.cr.factorial;

public class Factorial {
	public static int factorial(int numero) {
		if (numero==0) {
			return 1;
			
		} else {
			return numero*factorial(numero-1);
		}
	}
}
