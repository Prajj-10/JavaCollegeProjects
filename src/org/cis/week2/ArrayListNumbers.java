/**
 * 
 */
package org.cis.week2;

import java.util.ArrayList;

/**
 * 
 */
public class ArrayListNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(20);
		numbers.add(1);
		numbers.add(8);
		numbers.add(9);
		numbers.add(6);
				
		for(int num: numbers) {
			sum = sum + num ;
		}
		System.out.println("The total value is : " + sum);
		
		

	}

}
