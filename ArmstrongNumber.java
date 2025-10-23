package com.codegnan.controlstatements;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int originalnum=num;
		int r=0,cubedNum=0;
		while(num>0){
			r=num%10;
			cubedNum=cubedNum+(r*r*r);
			num/=10;
		}
		if(originalnum==cubedNum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong");
		}
		sc.close();
	}

}
