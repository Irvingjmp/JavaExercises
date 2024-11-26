package org.ejercicioForLoops;
import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un numero para realiza la secuencia");
		int n = sc.nextInt();
		
		int a=0, b=1;
		int count = 0;
		
		
		System.out.println("La secuencia es:");
		
		do {
			System.out.print(a+" ");
			int siguiente = a+b;
			a=b;
			b=siguiente;
			count++;
		}while(count<n);
		
		sc.close();
		
	}
}
