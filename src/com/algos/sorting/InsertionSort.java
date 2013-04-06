package com.algos.sorting;

import com.algos.utils.SortingUtils;

public class InsertionSort {

	/**
	 * @param args
	 */
	
	public static Comparable[] sort(Comparable[] a,int lo, int hi)
	{
		
		
		
	Comparable minIndex = 0;
		for (int i = lo; i <= hi; i++) {
		
			
			for (int j = i; j >0; j--) {
		
			
				if(SortingUtils.less(a[j], a[j-1]))
				{
					SortingUtils.swap(j, j-1, a);
				}
				
				
			}
			
		
		}
		
		
		return a;
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparable a[] = {9,8,7,6,5,4,3,2,1};
		Comparable b[]={'C','Q','W','V','A','L','X'};
		
	     a =   InsertionSort.sort(a,0,a.length-1);
		    SortingUtils.log(a);

		b=InsertionSort.sort(b,0,b.length-1);
		

	    SortingUtils.log(b);
	}

}
