package com.algo.search;

import java.util.Arrays;

public class BinarySearch {

	/**
	 *  first sort the array
		We basically ignore half of the elements just after one comparison.
		
		Compare x with the middle element.
		If x matches with middle element, we return the mid index.
		Else If x is greater than the mid element, then x can only lie in right half subarray after the mid element. So we recur for right half.
		Else (x is smaller) recur for the left half.
		
		time complexity = O(log n)
	*/	
	public static void main(String[] args) {
		int arr[] = {12,45,234,67,89,34,57};
		Arrays.sort(arr);
		int rhs = arr.length;
		int lhs = 0;
		int searchNum = 12;
		
		int index = doBinarySearch(arr, rhs, lhs, searchNum);
		
		if (index != -1) {
			System.out.println(searchNum +" found at index "+ index);
		}else
		{
			System.out.println(searchNum +" found not found");
		}	}
	
	private static int doBinarySearch(int[] arr, int rhs, int lhs, int searchNum){
		if(rhs >= lhs){
			
			// calculate mid element
			int mid = (lhs+rhs)/2;
			
			// check weather mid element is search number  
			if(arr[mid] == searchNum){
				return mid;				
			}
			
			// if element is smaller than mid element it may be present at left sub array
			if(arr[mid]>searchNum){
				return doBinarySearch(arr, (mid-1), lhs, searchNum);
			}
			
			// if element is greater than mid element it may be present at right sub array
			return doBinarySearch(arr, rhs, (mid+1), searchNum);
		
		}
		
		//if no element found return -1
		return -1;
	}

}
