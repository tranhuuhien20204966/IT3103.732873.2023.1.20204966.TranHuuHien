package JavaBasics;

import java.util.Scanner;

public class DisplayTriangle {
	public static void triangle( int n) {
	for( int i = 0 ; i < n ; i++) {
		System.out.println("\n");
		for(int k = n-i ; k >=0 ; k--) {
			System.out.print(" ");
		}
		for(int j = 0 ; j < (i*2)+1; j++ )
		{
			System.out.print("*");
		}
	}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your height of n stars (*):");
		int n = sc.nextInt();
		triangle(n);
	}
}
