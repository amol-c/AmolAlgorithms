package com.algos.sorting;

import com.algos.utils.SortingUtils;

public class MergeSortBottomUp {

	/**
	 * @param args
	 */
	
	
	
	
	
	
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
	
	
	public static void sort(Comparable[] a){
		
		
		
		
		
		
		
		Comparable[] aux = new Comparable[a.length];

		
		for (int sz = 1; sz < aux.length; sz=sz+sz) {
			for (int lo = 0; lo < aux.length - sz; lo=lo+sz+sz) {
				
				int hi = Math.min(lo+sz+sz-1, aux.length-1);
				int mid=lo+sz-1;
				merge(a, aux, lo,mid, hi);
			}
		}
		
		

		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparable a[] = {12,11,10,9,8,7,6,5,4,3,2,1,0};
		Comparable b[]={'L','K','J','I','H','G','F','E','D','C','B','A'};
		

		
		
		MergeSortBottomUp.sort(a);
	    SortingUtils.log(a);

	    MergeSortBottomUp.sort(b);

	    
	    SortingUtils.log(b);

		
	}

}
