package com.algo.sort;

import java.util.Arrays;

public class SelectionSort {

	/*112,45,234,67,89,34,57
	 *45,112,234,67,89,34,57
	 *45,67,234,112,89,34,57
	 *45,67,112,234,89,34,57
	 *45,67,112,89,234,34,57
	 *45,67,112,89,34,234,57
	 *45,67,112,89,34,57,234
	 *   
	 * 
	 * */
	public static void main(String[] args) {
		int arr[] = {112,45,234,67,89,34,57};
		int length = arr.length;
		doSelectionSort(arr,length);
		System.out.println(Arrays.toString(arr));
	}

	private static void doSelectionSort(int[] arr, int length) {
		for(int i=0; i<length; i++){
			
			int min_indx = i;
			for(int j = i+1; j<length; j++){
				if(arr[j] < arr[min_indx]){
					min_indx = j;					
				}							
			}	
			
			int temp = arr[min_indx];
			arr[min_indx] = arr[i];
			arr[i] = temp;
			System.out.println(Arrays.toString(arr));
		}		
	}

}
