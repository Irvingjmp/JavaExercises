package org.ejercicioForLoops;
import java.util.Scanner;

public class EjercicioForLoops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa tu nombre: ");
		String nombre = sc.next();
		for(char letra: nombre.toCharArray()) {
			System.out.println(letra+" ");
		}
		sc.close();
	}
}
