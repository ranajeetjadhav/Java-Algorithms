/**
 * 	1 
	1 2 1 
	1 2 3 2 1 
	1 2 3 4 3 2 1 
	1 2 3 4 5 4 3 2 1 
	1 2 3 4 5 6 5 4 3 2 1 
	1 2 3 4 5 6 7 6 5 4 3 2 1 
*/
package com.algo.sort.number.patterns;

public class Pattern_6 {

	public static void main(String[] args) {
		for(int i = 1; i <= 7; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j+" ");
			}
			
			for(int k = i-1; k > 0; k--){
				System.out.print(k+" ");
			}
			
			System.out.println();
		}
	}

}
