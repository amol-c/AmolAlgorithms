package com.algos.sorting;


import javax.swing.text.DefaultEditorKit.CutAction;

import com.algos.stdutils.StdRandom;
import com.algos.utils.SortingUtils;

public class QuickSort {

	
    public static void sort(Comparable[] a) {
    	
    	//Do a random shuffle.  StdRandom.shuffle(a);
    	StdRandom.shuffle(a);
    	sort(a,0,a.length-1);
    	
    	
    	
    	
    }
	
  static  int CUTOFF = 10;
    private static void sort(Comparable[] a, int lo, int hi) { 

    	
    	if (hi<=lo + CUTOFF - 1) {
			InsertionSort.sort(a,lo,hi);
    		
		}
    	
    	if(hi<=lo)
    		return;
    	
    	int mid = partition(a, lo, hi);
    	
    	sort(a,lo,mid-1);
    	sort(a,mid+1,hi);	
    	
    	
    }
	
	
	
	
	 // partition the subarray a[lo .. hi] by returning an index j
    // so that a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
    private static int partition(Comparable[] a, int lo, int hi) {

    	Comparable v = a[lo];
    	int i = lo;
    	int j=hi+1;

   while(true)
   {
	   
	   while(SortingUtils.less(a[++i], v)){
		  if(i == hi) break; 
	   }
	   
	   
	   while(SortingUtils.less(v, a[--j])){
		   if(j==lo) break;
		   
	   }
	   
	   
	   if(i>=j) break;
	   
	   SortingUtils.swap(i, j, a);
	   
	   
	   
   }
    	
    	SortingUtils.swap(lo, j, a);
    	
    	return j;
    }
	
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparable a[] = {9,8,7,6,5,4,3,2,1,0,9,8,7,6,5,4,3,2,1,3,5,3,0,9,8,7,6,5,4,3,2,1};
		Comparable b[]={'L','K','J','I','H','G','F','E','D','C','B','A'};
		

		
		
		QuickSort.sort(a);
	    SortingUtils.log(a);

	    QuickSort.sort(b);

	    
	    SortingUtils.log(b);

		
	}

}
