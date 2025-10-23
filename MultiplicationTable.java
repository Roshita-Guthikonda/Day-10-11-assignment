package com.codegnan.controlstatements;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int product;
		for(int i=1;i<=10;i++) {
			product=i*n;
			System.out.println(+n +"*"+i+"="+product);
		}
		s.close();
	}

}
