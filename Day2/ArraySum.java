package com.ey;

public class ArraySum {
	
		public static int sum(int a[]) {
			int sum=0;
			int t=a.length;
			for (int x=0; x<t;x++) {
				sum+=a[x];
			}
			return sum;
		}
		
		public static float avg(int a[]) {
			int sum=0;
			int t=a.length;
			for (int x=0; x<t;x++) {
				sum+=a[x];
			}
			float k;
			k=sum/t;
			return k;
		}
		
		public static void main(String[] args) {
			int a[]= {3,5,1,4,2};
			System.out.println(sum(a));
			System.out.println(avg(a));


		}

	}



