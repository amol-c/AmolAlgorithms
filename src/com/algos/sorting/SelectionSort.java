package com.algos.sorting;

import com.algos.sorting.*;
import com.algos.utils.SortingUtils;


public class SelectionSort {

	
	
	
	public static Comparable[] sort(Comparable[] a)
	{
		
		//int min=0;
		Comparable min = null;
		int swapIndex=0;
		
		for (int i = 0; i < a.length; i++) {
			
			min=a[i];
			
			for (int j = i+1; j < a.length ; j++) {
				if(!SortingUtils.less(min,a[j])){
					min=a[j];
					swapIndex=j;
				}
				
				
			}
			
			if(a[i]!=min){
			a=SortingUtils.swap(i,swapIndex, a); 
			}
		}
		
		
		
		return a;
	}
		
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Comparable a[] = {9,8,7,6,5,4,3,2,1};
		Comparable b[]={'C','Q','W','V','A','L','X'};
		
	     a =   SelectionSort.sort(a);
		b=SelectionSort.sort(b);
		
	    SortingUtils.log(a);
	    
	    SortingUtils.log(b);
	}
	
}
