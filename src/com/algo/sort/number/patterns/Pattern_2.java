 /**
  * 1111111
  * 1111122
  * 1111333
  * 1114444
  * 1155555
  * 1666666
  * 7777777
  */
package com.algo.sort.number.patterns;

public class Pattern_2 {

	public static void main(String[] args) {
		int rows = 7;
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= rows-i; j++){
				System.out.print(1);
			}
			for(int k = 1; k <= i ; k++){
				System.out.print(i);
			}
			
			System.out.println();
		}
			
	}

}
