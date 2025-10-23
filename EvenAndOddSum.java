package com.codegnan.controlstatements;

import java.util.Scanner;

public class EvenAndOddSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int evenSum = 0, oddSum = 0;
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 == 0) {
	                evenSum += i;  
	            } else {
	                oddSum += i;  
	            }
	        }

	        
	        System.out.println("Sum of even numbers: " + evenSum);
	        System.out.println("Sum of odd numbers: " + oddSum);
	        

		sc.close();
	}

}
