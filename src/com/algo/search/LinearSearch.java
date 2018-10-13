package com.algo.search;

public class LinearSearch {

	/**	A simple approach is to do linear search, i.e
	
		Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
		If x matches with an element, return the index.
		If x doesn’t match with any of elements, return -1.
		Example:
		int arr[] = {12,45,234,67,89,34,57}
		search = 67 will return 3
		search = 99 will return -1
		
		time complexity: O(n)
	 */			
	public static void main(String[] args) {
		int arr[] = {12,45,234,67,89,34,57};
		int length = arr.length;
		int searchNum = 99;
		
		int index = doLinearSearch(arr,length,searchNum);
		
		if (index != -1) {
			System.out.println(searchNum +" found at index "+ index);
		}else
		{
			System.out.println(searchNum +" found not found");
		}
		
	}

	private static int doLinearSearch(int[] arr, int length, int searchNum) {
		for(int i=0; i<length;i++){
			if(arr[i] == searchNum)
				return i;
		}
		
		return -1;
	}

}
