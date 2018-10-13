package com.algo.sort.misc;

public class TripletInArray {

	public static void main(String[] args) {
		int numArr[] = {2, 7, 5, 3, 8, 4, 1, 9};
		int lwr_lmt = 8;
		int upr_lmt = 16;
		int length = numArr.length;
		int result = 0;
		
		for(int i = 0; i < length-2; i++){
			for(int j = i+1; j < length-1; j++ ){
				for(int k = j+1; k < length; k++){
					if(numArr[i]+numArr[j]+numArr[k] >= lwr_lmt &&
					   numArr[i]+numArr[j]+numArr[k] <= upr_lmt){
						result++;
					}
				}
			}
		}
		
		System.out.println("Count of triplets:"+result);
	}

}
