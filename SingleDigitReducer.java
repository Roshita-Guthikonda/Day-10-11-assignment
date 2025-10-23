package com.codegnan.controlstatements;

import java.util.Scanner;

public class SingleDigitReducer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		while(number>=10) {//if number has more than one single digit
			int digitSum=0;//variable to store sum of digits for this round
			while(number>0) {//extract and sum all digits of the current number
				int lastDigit=number%10;//to get last digit
				digitSum+=lastDigit;//add it to the running total
				number=number/10;//to remove last number
			}
			//after summing all the digits ,set numbers to the new sum.
			// and repeat if it still has more than one digit.
			number=digitSum;
		}
		//when number becomes a single digit print the result
		System.out.println(number);
		sc.close();
	}

}
