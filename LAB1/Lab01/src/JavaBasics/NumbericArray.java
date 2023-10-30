package JavaBasics;

import java.util.Scanner;

public class NumbericArray {
	public static void sortArry( double arr[], int n) {
		double min = arr[0];
		for(int i = 0 ; i < n ; i++) {
			for(int j = i +1 ; j < n ; j++) {
				if(arr[j] <= min){
					min = arr[j];
					arr[j]= arr[i];
					arr[i]= min ;
				}
			}
				
		}	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double arr[];
		double sum = 0, average = 0;
		
		System.out.println("Enter the number of array :");
		int n = sc.nextInt();
		arr = new double[n];
		System.out.println("Enter your array :");
		for( int i = 0 ; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		System.out.println("Your array arr["+n+"]: \n");
		for( int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sortArry(arr, n);
		System.out.println("\n Your sort array arr["+n+"]: \n");
		for( int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			sum += arr[i];		
		}
		System.out.println(" \nthe sum and average of array : " + sum + ", "+ (sum/n));
		
		
	}
}
