package com.ey;

public class Array {
	public static int maximum(int a[]) {
		int max=a[0];
		for (int x:a) {
			if(max<x) {
				max=x;
			}
		}
		return max;
	}
	public static int minimum(int a[]) {
		int min=a[0];
		for (int x:a) {
			if(x<min) {
				min=x;
			}
		}
		return min;
	}
	
	public static int secondmax(int a[]) {
		int k=a.length;
		int temp;
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<k;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[k-2];
		
	}
	public static int secondmin(int a[]) {
		int k=a.length;
		int temp;
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<k;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[k-2];
		
	}
	
	public static void main(String[] args) {
		int a[]= {4,6,8,1,3};
		System.out.println(maximum(a));
		System.out.println(minimum(a));
		System.out.println(secondmax(a));
		System.out.println(secondmin(a));


	}

}
