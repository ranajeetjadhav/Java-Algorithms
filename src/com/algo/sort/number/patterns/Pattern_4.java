/**	1 2 3 4 5 6 7 
	1 2 3 4 5 6 
	1 2 3 4 5 
	1 2 3 4 
	1 2 3 
	1 2 
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 
	1 2 3 4 5 6 
	1 2 3 4 5 6 7 
*/

package com.algo.sort.number.patterns;

public class Pattern_4 {

	public static void main(String[] args) {
		for(int i = 7; i >=1; i--){
			for(int j = 1; j <= i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i = 2; i <= 7; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}