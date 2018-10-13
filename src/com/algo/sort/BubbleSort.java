package com.algo.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {112,45,234,67,89,34,57};
		int lenght = arr.length;
		doBubbleSort(arr, lenght);
	}
	
	private static void doBubbleSort(int arr[], int lenght){
		for(int i = 0; i< (lenght-1); i++){
			for(int j = 0; j< (lenght-1); j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;					
				}
				//System.out.println(Arrays.toString(arr));
			}
			System.out.println(Arrays.toString(arr));
		}
	} 

}
