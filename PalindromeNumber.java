package com.codegnan.controlstatements;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int reverse=0;
		int originalnum=num;
		while(num>0) {
			reverse=reverse*10+num%10;
			num/=10;
		}
		if(originalnum==reverse) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		sc.close();
	}

}
