package com.algos.sorting;

import com.algos.utils.SortingUtils;

public class MergeSort {

	
	
	
	
	
	public static void merge(Comparable[] a,Comparable[] aux,int lo,int mid,int hi)
	{
		
	     // copy to aux[]
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k]; 
        }

        // merge back to a[]
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid)              a[k] = aux[j++];
            else if (j > hi)               a[k] = aux[i++];
            else if (SortingUtils.less(aux[j], aux[i])) a[k] = aux[j++];
            else                           a[k] = aux[i++];
        }

	}
	
	
	public static void sortUsingRecurssion(Comparable[] a,Comparable[] aux, int lo, int hi)
	{
		
		
		if(hi<=lo) {
			return ;
		}
		int  mid = lo +(hi-lo)/2;
		sortUsingRecurssion(a, aux, lo, mid);
		sortUsingRecurssion(a, aux, mid+1, hi);
		merge(a,aux,lo,mid,hi);
		
		
	
		
		
		
		
	}
	
	
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comparable a[] = {9,8,7,6,5,4,3,2,1};
		Comparable b[]={'C','Q','W','V','A','L','X'};
		
		Comparable[] aux = new Comparable[a.length];
	     MergeSort.sortUsingRecurssion(a, aux, 0, a.length-1);
	     
		MergeSort.sortUsingRecurssion(b, aux, 0, b.length-1);
		
		 //  a =  MergeSort.sortUsingRecurssion(a);
		     
			//b=MergeSort.sortUsingRecurssion(b);
			
		
	    SortingUtils.log(a);
	    
	    SortingUtils.log(b);
	}

}
