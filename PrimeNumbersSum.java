package com.codegnan.controlstatements;

import java.util.Scanner;

public class PrimeNumbersSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int count = 0;
		int sum=0;
		for (int i = 2; i <= n; i++) {
			int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
               sum+=i;
            }
        }
		System.out.println(sum);
        sc.close();

	}

}
