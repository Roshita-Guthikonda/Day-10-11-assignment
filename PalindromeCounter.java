package com.codegnan.controlstatements;

import java.util.Scanner;

public class PalindromeCounter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int upperLimit=sc.nextInt();
		int currentNumber=1;//iterator from 1 to n
		int palindromeCount=0;//counter to store number of palindromes
		
		while(currentNumber<=upperLimit) {
			int originalNumber=currentNumber;//keep the original number
			int numberToReverse=originalNumber;//temporary variable for reversinh
			int reversedNumber=0;//store reverse number
			
			while(numberToReverse>0) {
				int lastDigit=numberToReverse%10;//track last digits
				reversedNumber=reversedNumber*10+lastDigit;//append digit
				numberToReverse=numberToReverse/10;//remove lastDigit
			}
			//check if the original and reversednumbers are same
			if(originalNumber==reversedNumber) {
				palindromeCount++;//increment the count if palindrome
			}
			currentNumber++;//move to next number
		}
		System.out.println(palindromeCount);
		sc.close();

	}

}
