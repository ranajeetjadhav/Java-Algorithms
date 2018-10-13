/**
 * 	1 
	1 0 
	1 0 1 
	1 0 1 0 
	1 0 1 0 1 
	1 0 1 0 1 0 
	1 0 1 0 1 0 1 
*/
package com.algo.sort.number.patterns;

public class Pattern_9 {

	public static void main(String[] args) {
		for(int i = 1; i <=7; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
	}

}
