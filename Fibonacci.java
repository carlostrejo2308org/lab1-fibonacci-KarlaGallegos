package Calidad;
import java.util.Scanner;

public class Fibonacci {
	
	public static int Recursivo(int num) {
		if (num < 2)
			return num;
		
		else 
			return Recursivo(num - 1) + Recursivo(num - 2);
	}
	
	public static int Iterativo(int num) {
		int siguiente = 1, actual = 0, temporal = 0;
		for (int x = 1; x <= num; x++) {
			
			temporal = actual;
			actual = siguiente;
			siguiente = siguiente + temporal;
		}
		
		return actual;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese la posicion: ");
		int n = s.nextInt();
		
		System.out.println("Iterativo: " + Iterativo(n));
		System.out.println("Recursivo: " + Recursivo(n));

	}

}
