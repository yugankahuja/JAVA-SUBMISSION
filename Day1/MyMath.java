package com.ey.util;
import java.lang.Math;

public class MyMath {
	
	public static boolean isPerfectNumber(int n) {
        if (n == 1)
            return false;
        int sum = 1;
 
        for (int i = 2; i < n; i++) {
 
            if (n % i == 0) {
                sum += i;
            }
        }
 
        if (sum == n)
            return true;
 
        return false;
	}
	
	public static long factorial(int n) {
		 int res = 1, i; 
	        for (i = 2; i <= n; i++) 
	            res *= i; 
	        return res;
	}



public static boolean isPrime(int n) {
	int i=2;
	if(n==0||n==1)
	{
		return false;
		
	}
	if(n==i)
		return true;
	else if(n%i==0)
		return false;
	i++;
	return true;
	
}

public static long SumofPrimes(int n){
    int sum = 0;
    for (int i = n; i >= 1; i--) {

        boolean isPrime = isPrime(i);
        if (isPrime) {

            sum = sum + i;
        }
    }
    return sum;
}


//public static boolean isArmstrongNumber(int n)
//{
//    int count = 0;
//
//    for (int i = 1; i <= Integer.MAX_VALUE; i++) {
//        int num = i, rem, digit = 0, sum = 0;
//
//        num = i;
//
//        digit = (int)Math.log10(num) + 1;
//
//        while (num > 0) {
//            rem = num % 10;
//            sum = sum + (int)Math.pow(rem, digit);
//            num = num / 10;
//        }
//
//        if (i == sum)
//            count++;
//        if (count == n)
//            return i;
//    }
//    return n;
	public static int power(int x, long y)
    {
        if (y == 0)
            return 1;
        if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        return x * power(x, y / 2) * power(x, y / 2);
    }
 
    public static int order(int x)
    {
        int n = 0;
        while (x != 0) {
            n++;
            x = x / 10;
        }
        return n;
    }
 
    public static boolean isArmstrongNumber(int x)    {
        int n = order(x);
        int temp =  x, sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + power(r, n);
            temp = temp / 10;
        }
 
        return (sum == x);
    
}

public static int reverseNumber(int n) {
	   { 
	        int rev = 0; 
	        int rem; 
	  
	        while (n > 0) { 
	            rem = n % 10; 
	            rev = (rev * 10) + rem; 
	            n = n / 10; 
	        } 
	  
	        return rev; 
	    } 
}

public static int decimalToBinary(int N) 
{ 

    int B_Number = 0; 
    int cnt = 0; 
    while (N != 0) { 
        int rem = N % 2; 
        double c = Math.pow(10, cnt); 
        B_Number += rem * c; 
        N /= 2; 

        cnt++; 
    } 

    return B_Number; 
} 

public static int binaryToDecimal(int n) 
    {
        int num = n;
        int dec_value = 0;
 
        int base = 1;
 
        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
 
            dec_value += last_digit * base;
 
            base = base * 2;
        }
 
        return dec_value;
    }
 
 public static int getsumofNfibos(int n) {
     int a = 0, b = 0, sumf = 1; 
     if (n <= 0)
       sumf = 0;
     int curr = 1;
     for(int i = 1; i < n; i++){
         a = b;
         b = curr;
         curr = a+b;
         sumf += curr;
     }
     return sumf;
  }
 
 public static boolean isPalindromeNumber(int n) {
	 int reverseN = reverseNumber(n);
     if (n == reverseN)
         return true;
     else
         return false;
     
     
 }
}