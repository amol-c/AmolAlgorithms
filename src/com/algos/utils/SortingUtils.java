package com.algos.utils;

public class SortingUtils {

	/**
	 * @param args
	 */
	
	public static void log(Comparable[] a)
	{
		for (int i = 0; i < a.length; i++) {
			 System.out.println( a[i] + ", ");
		}
	}
	

	public static Boolean less(Comparable a,Comparable b)
	{
		Boolean isLess = a.compareTo(b)<0;
		
		return isLess;
	}
	
	
	
	public static Comparable[] swap(int i,int j,Comparable[] a)
	{
			Comparable temp = a[i];
			a[i]=a[j];
			a[j]=temp;
		return a;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
