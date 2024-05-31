package com.ey;

public class SortingArray {
	
		public static int[] asc(int a[]) {
			
	       int a1[]=new int[a.length];
	       System.arraycopy(a, 0,a1,0, a.length);
	       for(int i=0;i<=a1.length;i++)
	       {
	    	   for(int j=i+1;j<a1.length;j++)
	    	   {
	    		   if(a1[i]>a1[j])
	    		   {
	    			   int temp=a1[i];
	    			   a1[i]=a1[j];
	    			   a1[j]=temp;
	    		   }
	    	   }
	       }
	    	   return a1;
	        
		}
		
		public static int[] des(int a[]) {
			int a1[]=new int[a.length];
			System.arraycopy(a, 0,a1,0, a.length);
			for(int i=0;i<=a1.length;i++)
		       {
		    	   for(int j=i+1;j<a1.length;j++)
		    	   {
		    		   if(a1[i]<a1[j])
		    		   {
		    			   int temp=a1[i];
		    			   a1[i]=a1[j];
		    			   a1[j]=temp;
		    		   }
		    	   }
		       }
		    	   return a1;
		
		}
		
		static void printArray(int a[]) {
			for(int x:a)
			{
				System.out.print(x+" ");
			}
		}
		
		public static void main(String[] args) {
			int a[]= {3,5,1,4,2};
			printArray(asc(a));
			System.out.println(" ");
			printArray(des(a));


		}

	}



