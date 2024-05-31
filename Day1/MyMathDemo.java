package com.ey.ui;

import com.ey.util.MyMath;
import java.util.Scanner;

public class MyMathDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number-");
		int n=sc.nextInt();
		MyMath sd=new MyMath();
		System.out.println(sd.isPerfectNumber(n));
		System.out.println(sd.factorial(n));
		System.out.println(sd.isPrime(n));
		System.out.println(sd.SumofPrimes(n));
		System.out.println(sd.isArmstrongNumber(n));
		System.out.println(sd.reverseNumber(n));
		System.out.println(sd.decimalToBinary(n));
		System.out.println(sd.binaryToDecimal(n));
		System.out.println(sd.getsumofNfibos(n));
		System.out.println(sd.isPalindromeNumber(n));
	}

}
