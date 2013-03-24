package com.algos.sorting;




public class SelectionSort {

	
	
	
	public static int[] sort(int[] a)
	{
		
		int min=0;
		
		int swapIndex=0;
		
		for (int i = 0; i < a.length; i++) {
			
			min=a[i];
			
			for (int j = i+1; j < a.length ; j++) {
				if(min>a[j]){
					min=a[j];
					swapIndex=j;
				}
				
				
			}
			
			if(a[i]!=min){
			a=swap(i,swapIndex, a); 
			}
		}
		
		
		
		return a;
	}
		
	
	
	public static int[] swap(int i,int j,int[] a)
	{
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
		return a;
		
	}
	
	
	public static void log(int [] a)
	{
		for (int i = 0; i < a.length; i++) {
			 System.out.println( a[i] + ", ");
		}
	}
	
	
	public static void main(String[] args) {
		
		
		int a[] = {3,4,1,2,7,4,2,0,3};
		
	     a =   SelectionSort.sort(a);
		
	    log(a);
	}
	
}
