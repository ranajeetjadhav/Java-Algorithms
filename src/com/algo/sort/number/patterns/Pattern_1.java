 /**
  * 1
  * 12
  * 123
  * 1234
  * 12345
  * 123456
  * 1234567
  */

package com.algo.sort.number.patterns;

public class Pattern_1 {

	public static void main(String[] args) {
	
		int rows = 7;
		for(int i = 0; i < rows; i++){
			for(int j = 0; j <= i; j++){
				System.out.print(j+1+" ");
			}
			System.out.println();
			
		}
		
		
	}

}
