package com.codegnan.controlstatements;

import java.util.Scanner;

public class MobilePin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pin=sc.nextInt();
		int count=0;
		while(pin>0) {
			pin/=10;
			count++;
		}
		System.out.println(count);
		sc.close();
	}

}
